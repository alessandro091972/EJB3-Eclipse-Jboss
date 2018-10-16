package com.alessandro.logic;

import javax.ejb.Remote;

@Remote
public interface HelloWorld {
    public String sayHello();
}

