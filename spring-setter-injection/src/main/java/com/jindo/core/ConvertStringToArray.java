package com.jindo.core;

/**
 * @author ManhKM on 6/29/2022
 * @project spring-setter-injection
 */
public class ConvertStringToArray {
    public static void main(String[] args) {
        String configLocation = "spring.xml, data.xml, config.xml, application.xml";

        String[] data = new String[]{configLocation};
        for (String i: data) {
            System.out.println(i);
        }
    }
}
