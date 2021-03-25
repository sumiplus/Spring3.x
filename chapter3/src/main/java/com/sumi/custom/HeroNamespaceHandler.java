package com.sumi.custom;


import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class HeroNamespaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("elementname1", new HeroBeanDefinitionParser(Hero.class));
    }
}