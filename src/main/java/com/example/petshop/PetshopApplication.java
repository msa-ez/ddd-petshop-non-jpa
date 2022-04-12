package com.example.petshop;

import java.util.ArrayList;
import java.util.List;

import com.example.petshop.domain.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PetshopApplication {

    public static ApplicationContext applicationContext;
    public static void main(String[] args) throws Exception{
        applicationContext = SpringApplication.run(PetshopApplication.class, args);

        // Dependency Inversion


        // Dynamic casting
        boolean drunk = true;
        

        Pet somePet = new Human();   
        if(drunk)
            somePet = new Dog();

        System.out.println(somePet.getClass());
        

        // Standardized Batch processing //polymorphism
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Pet());
        pets.add(new Pet());

        boolean mysqlIsPreferred = true;

        //Repository repository = applicationContext.getBean(Repository.class);

        int newHealth = 100;

        pets.forEach(pet ->{
            System.out.println("건강 " + pet.getHealth());
          //  pet.repository = repository;
            pet.feed();

            
//            if(newHealth > 90) throw new RuntimeException("health 는 90 넘으면 안됨");  // Anemic domain model
            pet.setHealth(90);

            System.out.println("건강 " + pet.getHealth());

            pet.save();
        });


    }


}


