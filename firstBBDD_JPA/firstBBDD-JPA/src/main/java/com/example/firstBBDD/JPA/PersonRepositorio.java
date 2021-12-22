package com.example.firstBBDD.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepositorio extends JpaRepository<Persona, Integer> {

    List<Persona>findByName(String name);

}
