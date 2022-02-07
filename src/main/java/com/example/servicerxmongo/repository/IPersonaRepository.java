package com.example.servicerxmongo.repository;

import com.example.servicerxmongo.model.Persona;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface IPersonaRepository extends ReactiveMongoRepository<Persona,String> {

    Flux<Persona> findByNombre(String nombre);

    /* Enviando el parametro de query
    @Query("{'edad' : ?0}")
    Flux<Persona> findByEdad(int edad);
     */
}
