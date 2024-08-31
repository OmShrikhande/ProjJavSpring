package com.example.withoutweb;

import org.springframework.stereotype.Component;

@Component
//@primary - when both the classes had the component annotation in them.
public class Laptop implements Computer {

    public void compile(){
        System.out.println("no bug found404");
    }
}
