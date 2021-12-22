package com.example.firstBBDD.JPA;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDelete {
    @Autowired
    PersonRepositorio personRepositorio;

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
        if (personRepositorio.findById(id).isPresent()) {
            personRepositorio.deleteById(id);
        } else {
            {
                new Exception("Usuario no econtrado");
            }

        }

    }
}
