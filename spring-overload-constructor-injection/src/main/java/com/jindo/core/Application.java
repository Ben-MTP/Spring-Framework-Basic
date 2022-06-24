package com.jindo.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ManhKM on 6/24/2022
 * @project spring-overload-constructor-injection
 */
public class Application {
    public static void main(String[] args) {
        BeanFactory context = new ClassPathXmlApplicationContext("spring.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
