package com.core;

/**
 * @author ManhKM on 6/29/2022
 * @project spring-bean-autowiring
 */
public class Table {
    private String code;

    public void setCode(String code){
        this.code = code;
    }

    @Override
    public String toString() {
        return "Table{" +
                "code='" + code + '\'' +
                '}';
    }
}
