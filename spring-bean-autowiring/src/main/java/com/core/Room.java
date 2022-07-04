package com.core;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ManhKM on 6/29/2022
 * @project spring-bean-autowiring
 */
public class Room {

    @Autowired
    private Table table;

    public Room(){}

    public Room(Table table){
        this.table = table;
    }

    public Table getTable(){
        return table;
    }

    public void setTable(Table table){
        this.table = table;
    }
}
