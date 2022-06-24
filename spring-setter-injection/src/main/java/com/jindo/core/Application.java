package com.jindo.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ManhKM on 6/21/2022
 * @project spring-setter-injection
 */
public class Application {
    public static void main(String[] args) {

        BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");
        Clazz clazz = (Clazz) context.getBean("clazz");
        System.out.println(clazz.toString());
    }
}
