package com.example.secondapp;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private String name;
    private  String phone;
    private java.util.List<String> userList;

    List<String> getUserList(){
        userList= new ArrayList<>(); {
        }

        for (int i=0;i<100;i++){
            this.userList.add("Человек_"+i);
        }
        return userList;
    }
}
