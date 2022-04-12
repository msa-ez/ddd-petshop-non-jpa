package com.example.petshop.domain;

import javax.persistence.*;

import com.example.petshop.PetshopApplication;

@Entity
public class Pet {

    @Id  @GeneratedValue
    Long id;


    int appearance;
        public int getAppearance() {
            return appearance;
        }
        public void setAppearance(int appearance) {
            this.appearance = appearance;
        }

    protected int health;
        public int getHealth() {
            return health;
        }
        public void setHealth(int health) {
            if(health > 90) throw new RuntimeException("health 는 90 넘으면 안됨");
            this.health = health;
        }

//    public Repository repository;

    public void feed(){
        //throw new RuntimeException("구현이 필요합니다");
    }

    public void save(){
        PetshopApplication.applicationContext.getBean(Repository.class).save(this);
    }
}
