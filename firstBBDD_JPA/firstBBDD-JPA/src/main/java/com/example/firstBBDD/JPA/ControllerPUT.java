package com.example.firstBBDD.JPA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPUT {
    @Autowired
    PersonRepositorio personRepositorio;

    @PutMapping("/persona/update/{id}")
    public Persona updatePersona(@PathVariable int id, @RequestBody Persona persona)throws Exception{
        if(personRepositorio.findById(id)!=null && persona.getUser()!=null){
            persona.setId(id);
            personRepositorio.saveAndFlush(persona);
            return persona;
        }else{
            throw new Exception("Usuario no ha podido salvarse exitosamente");
        }
    }
}
