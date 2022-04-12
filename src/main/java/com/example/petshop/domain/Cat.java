package com.example.petshop.domain;

public class Cat extends Pet{

    @Override
    public void feed() {
        super.feed();

        health += 1;
    }

    
}
