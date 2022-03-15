package com.example.springboot;

import org.springframework.stereotype.Service;

@Service
public class Counter {
    private int count = 0;

    public Counter(){

    }


    public int getCount() {
        return count++;
    }
}
