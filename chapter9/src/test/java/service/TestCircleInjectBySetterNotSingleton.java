package service;

import com.baobaotao.circleinject.CircleA;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircleInjectBySetterNotSingleton {

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable {
        try {
            ApplicationContext applicationContext = new ClassPathXmlApplicationContext("circleInjectBySetterNotSingleton.xml");
            CircleA a = (CircleA) applicationContext.getBean("circleA");
            System.out.println(a);

        } catch (Exception e) {
            throw e.getCause().getCause().getCause();
        }
    }
}
