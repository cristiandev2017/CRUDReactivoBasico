package com.example.servicerxmongo.services;

import com.example.servicerxmongo.model.Persona;
import com.example.servicerxmongo.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ServicePersonaImpl  implements IServicePersonas{

    @Autowired
    IPersonaRepository repository;

    @Override
    public Flux<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Flux<Persona> findPersonaByEdad(int edad) {
        return repository.findAll()
                .filter(
                        persona -> persona.getEdad() == edad);
    }

    @Override
    public Mono<Persona> save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Flux<Persona> findPersonaByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

    @Override
    public Mono<Persona> update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id).subscribe();
    }
}
