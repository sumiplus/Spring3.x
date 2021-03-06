package com.baobaotao.mixdao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.apache.commons.dbcp.BasicDataSource;

import com.baobaotao.User;

/**
 * @author 陈雄华
 * @version 1.0
 */
@Service("userService")
public class UserService extends BaseService {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Autowired
    private ScoreService scoreService;

    public void logon(String userName) {
        System.out.println("before userService.updateLastLogonTime()..");
        updateLastLogonTime(userName);
        System.out.println("end userService.updateLastLogonTime()..");

        System.out.println("before scoreService.addScore()..");
        scoreService.addScore(userName, 20);
        System.out.println("end scoreService.addScore()..");
    }

    public void updateLastLogonTime(String userName) {
        User user = (User) hibernateTemplate.get(User.class, userName);
        user.setLastLogonTime(System.currentTimeMillis());
        hibernateTemplate.update(user);
        hibernateTemplate.flush();//③请看下文的分析
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/baobaotao/mixdao/applicationContext.xml");
        UserService service = (UserService) ctx.getBean("userService");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        //插入一条记录，初始分数为10
        jdbcTemplate.execute("INSERT INTO t_user(user_name,password,score,last_logon_time) VALUES('tom','123456',10," + System.currentTimeMillis() + ")");

        //调用工作在无事务环境下的服务类方法,将分数添加20分
        System.out.println("before userService.logon()..");
        service.logon("tom");
        System.out.println("after userService.logon()..");

        int score = jdbcTemplate.queryForInt("SELECT score FROM t_user WHERE user_name ='tom'");
        System.out.println("score:" + score);
        jdbcTemplate.execute("DELETE FROM t_user WHERE user_name='tom'");
    }
}
