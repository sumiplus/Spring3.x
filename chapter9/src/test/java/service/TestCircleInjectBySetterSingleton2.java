package service;

import com.baobaotao.circleinject.CircleA;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircleInjectBySetterSingleton2 {

    @Test(expected = BeanCurrentlyInCreationException.class)
    public void testCircleByConstructor() throws Throwable {
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
            ctx.setAllowCircularReferences(false);
            ctx.setConfigLocation("circleInjectBySetterSingleton.xml");
            ctx.refresh();

        } catch (Exception e) {
            throw e.getCause().getCause().getCause();
        }
    }
}
