package com.example.BaseProyect.service;

import com.example.BaseProyect.entity.Persona;
import com.example.BaseProyect.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> findAll(){

        List<Persona> personas = personaRepository.findAll();


        return personas;
    }

    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }


}
