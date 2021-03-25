package service;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircleInjectByConstructor {

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable {
        try {
//            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath*:circleInjectByConstructor.xml");
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("circleInjectByConstructor.xml");

            applicationContext.getBean("circleA");

        } catch (Exception e) {
            // 因为要在创建circle3时抛出；
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }
}
