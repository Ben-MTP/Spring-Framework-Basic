package com.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.logging.Logger;

/**
 * @author ManhKM on 6/29/2022
 * @project spring-bean-autowiring
 */
public class Application {

    public static Log logger = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Table table = (Table) context.getBean("table");
        System.out.println("Only table: " + table.toString());

        Room room = (Room) context.getBean("room");
        if (room.getTable() != null) {
            logger.info("spring-bean-autowiring have: " + room.getTable().toString());
            System.out.println("Table in Room: " + room.getTable().toString());
        }
    }
}
