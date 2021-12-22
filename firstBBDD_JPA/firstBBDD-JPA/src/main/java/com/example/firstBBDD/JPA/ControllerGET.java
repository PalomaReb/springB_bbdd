package com.example.firstBBDD.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerGET {

    @Autowired
    PersonRepositorio personRepositorio;
    /*@GetMapping("/persona/{id}")
    public Persona getbyID(@PathVariable String id) throws Exception{
        return personRepositorio.findById(id).orElseThrow(() ->new Exception("Persona not found"));
    }*/

    @GetMapping("/persona/{name}")
    public List <Persona> getbyName(@PathVariable String name) throws Exception{
        return personRepositorio.findByName(name);
    }

    @GetMapping("/persona")
    public List <Persona> getAll(){
        return personRepositorio.findAll();
    }

    @GetMapping
    public Optional<Persona> getById(@PathVariable String id) throws Exception {
        if (personRepositorio.findById(id) != null) {
            return personRepositorio.findById(id);
        }
        else{
            throw new Exception("Usuario no puede ser nulo");
        }
    }
}
