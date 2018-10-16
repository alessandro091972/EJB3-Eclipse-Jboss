package com.alessandro.logic;

import com.alessandro.logic.HelloWorld;
import javax.ejb.Stateless;
 
@Stateless
public class HelloWorldBean implements HelloWorld {
    public HelloWorldBean() {
    }
 
    public String sayHello() {
        return "Hello World";
    }
}
