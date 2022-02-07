package com.example.servicerxmongo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "persona")
public class Persona {

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private int edad;

}
