package com.example.firstBBDD.JPA;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@Getter
@Setter

public class Persona {
    @Id
    @GeneratedValue
    private int id;


    private String user;
    private String password;
    private String name;
    private String lastName;
    private String compEmail;
    private String personalEmail;
    private String city;
    private Boolean active;
    private Date created_date;
    private String image;
    private Date term_date;


}
