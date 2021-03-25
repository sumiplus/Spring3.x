package com.baobaotao.aspectj.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baobaotao.Seller;
import com.baobaotao.Waiter;

public class DeclaredParentsTest {
	public static void main(String[] args) {
		/* 设置此系统属性,让JVM生成的Proxy类写入文件 */
		System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		String configPath = "com/baobaotao/aspectj/basic/beans.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		Waiter waiter = (Waiter)ctx.getBean("waiter");
		waiter.greetTo("John");
		Seller seller = (Seller)waiter;
		seller.sell("Beer", "John");
	}
}
