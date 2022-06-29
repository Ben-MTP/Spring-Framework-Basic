package com.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ManhKM on 6/29/2022
 * @project spring-bean-autowiring
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Table table = (Table) context.getBean("table");
        System.out.println("Only table: " + table.toString());

        Room room = (Room) context.getBean("room");
        if (room.getTable() != null) {
            System.out.println("Table in Room: " + room.getTable().toString());
        }
    }
}
