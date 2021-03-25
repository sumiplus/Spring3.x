package com.sumi.custom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HeroMain {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("hero.xml");
        Hero hero = (Hero) applicationContext.getBean(Hero.class.getName());
        System.out.println("name: " + hero.getName() + " age: " + hero.getAge());
    }
}