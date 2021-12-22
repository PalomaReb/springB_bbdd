package com.example.firstBBDD.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPOST {

    @Autowired
    PersonRepositorio personRepositorio;

    @PostMapping("/persona/add")
    public Persona addNewPerson(@RequestBody Persona persona)throws Exception{
        if (persona.getUser()!=null){
            if(persona.getPassword()!=null){
                if(persona.getName()!= null){
                    if(persona.getLastName()!=null){
                        if(persona.getCompEmail()!=null){
                            if(persona.getPersonalEmail()!=null){
                                if(persona.getCity()!=null){
                                    if(persona.getActive()!=null){
                                        if(persona.getCreated_date()!=null){
                                            if(persona.getImage()!=null){
                                                if(persona.getTerm_date()!=null){
                                                    personRepositorio.save(persona);
                                                }else {
                                                    throw new Exception("term date no puede ser nulo");
                                                }
                                            }else {
                                                throw new Exception("imagen no puede ser nulo");
                                            }
                                        }else {
                                            throw new Exception("la fecha creada no puede ser nulo");
                                        }
                                    }else {
                                        throw new Exception("active no puede ser nulo");
                                    }
                                }else {
                                    throw new Exception("ciudad no puede ser nulo");
                                }
                            }else {
                                throw new Exception("Email no puede ser nulo");
                            }
                        }else {
                            throw new Exception("email de empresa no puede ser nulo");
                        }
                    }else {
                        throw new Exception("Apellido no puede ser nulo");
                    }
                }else {
                    throw new Exception("Nombre no puede ser nulo");
                }
            }else {
                throw new Exception("password no puede ser nulo");
            }
        }else {
            throw new Exception("Usuario no puede ser nulo");
        }
        return persona;
    }
}
