package service;


import com.baobaotao.domain.Post;
import com.baobaotao.domain.Topic;
import com.baobaotao.service.BbtForum;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBbtForumAspectj{

	public static void main(String[] args) throws Throwable{
		String configPath = "classpath:applicationContext-aspectj.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		BbtForum bbtForum = ctx.getBean(BbtForum.class);
    	
    	Topic topic = new Topic();
    	topic.setTopicTitle("Title -pfb");
    	Post post = new Post();
    	post.setPostText("post content -pfb");
    	topic.setPost(post);
    	System.out.println("begin........");
    	bbtForum.addTopic(topic);
    	System.out.println("end........");
    }
}
