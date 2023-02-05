package com.example.BaseProyect.controller;

import com.example.BaseProyect.entity.Persona;
import com.example.BaseProyect.repository.PersonaRepository;
import com.example.BaseProyect.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
@CrossOrigin(origins = "*")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/find_all")
    public List<Persona> findAll(){

        List<Persona> personas = personaService.findAll();

        return personas;
    }

    @PostMapping("/save")
    public Persona save(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

}
