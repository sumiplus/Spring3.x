package service;

import com.baobaotao.circleinject.CircleA;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircleInjectBySetterSingleton {

    @Test
    public void testCircleByConstructor() throws Throwable {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("circleInjectBySetterSingleton.xml");
            CircleA a = (CircleA) applicationContext.getBean("circleA");
            System.out.println(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
