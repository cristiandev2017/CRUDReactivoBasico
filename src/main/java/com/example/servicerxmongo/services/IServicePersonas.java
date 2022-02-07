package com.example.servicerxmongo.services;

import com.example.servicerxmongo.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IServicePersonas {

    Flux<Persona> findAll();

    Flux<Persona> findPersonaByEdad(int edad);

    Mono<Persona> save(Persona persona);

    Flux<Persona> findPersonaByNombre(String nombre);

    Mono<Persona> update(Persona persona);

    void delete(String id);
}
