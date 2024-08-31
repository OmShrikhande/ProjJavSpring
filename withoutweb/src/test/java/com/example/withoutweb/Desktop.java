package com.example.withoutweb;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile(){
        System.out.println("no bug found");
    }
}
