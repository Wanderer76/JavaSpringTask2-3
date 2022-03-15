package com.example.springboot;

import org.springframework.stereotype.Service;


@Service
public class Company {
    private Address address;

    public Company(Address address) {
        this.address = address;
    }


    public Address getAddress() {
        return address;
    }
}
