package com.example.petshop.domain;

public class Dog extends Pet{

    @Override
    public void feed() {
        health += 2;
    }

}
