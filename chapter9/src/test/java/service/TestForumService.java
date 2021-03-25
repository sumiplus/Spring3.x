package service;

import com.baobaotao.domain.Forum;
import com.baobaotao.service.ForumService1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForumService {
	
//	public void testAddTopic(){
//		System.out.println("begin...........");
//		forumService.addTopic();
//		System.out.println("end!!!!!!!!!!!!!");
//	}
	
	public static void main(String[] args) throws Throwable{
		String configPath = "classpath*:applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		ForumService1 forumService1 = ctx.getBean(ForumService1.class);
		
		
		Forum forum = new Forum();
		forum.setForumDesc("desc");
		forum.setForumName("name");
		forumService1.addForum(forum);
		
//		ForumService forumService = ctx.getBean(ForumService.class);
//		System.out.println("begin...........");
//		forumService.addTopic();
//		System.out.println("end!!!!!!!!!!!!!");
	}

}
