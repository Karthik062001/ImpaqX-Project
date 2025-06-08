package com.example.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Alphabet1 {
    private final Alphabet2 alphabet2;

    @Autowired
    public Alphabet1(@Lazy Alphabet2 alphabet2) {
        this.alphabet2 = alphabet2;
    }
    public void dosome()
    {
    	System.out.println("A is doing task");
    }
}

