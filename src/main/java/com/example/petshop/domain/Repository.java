package com.example.petshop.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Pet, Long>{
    
}
