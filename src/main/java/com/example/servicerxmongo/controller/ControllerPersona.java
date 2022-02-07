package com.example.servicerxmongo.controller;

import com.example.servicerxmongo.model.Persona;
import com.example.servicerxmongo.services.IServicePersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ControllerPersona {

    @Autowired
    IServicePersonas service;

    @GetMapping("/getPersonas")
    public Flux<Persona> getPersona(){
        return service.findAll();
    }

    @GetMapping("/getPersonasByEdad/{edad}")
    public Flux<Persona> getPersonaByEdad(
                                        @PathVariable("edad") int edad){
        return service.findPersonaByEdad(edad);
    }

    @GetMapping("/getPersonasByNombre/{nombre}")
    public Flux<Persona> getPersonaByEdad(
                                        @PathVariable("nombre") String nombre){
        return service.findPersonaByNombre(nombre);
    }

    @PostMapping("/postPersona")
    public Mono<Persona> postPersona(@RequestBody Persona persona){
        return service.save(persona);
    }


    @PutMapping("/putPersona")
    public Mono<Persona> updatePersona(@RequestBody Persona persona){
        return service.update(persona);
    }


    @DeleteMapping("/deletePersona/{id}")
    public void deletePersona(@PathVariable ("id") String id){
                service.delete(id);
            }
}
