package com.example.cefet_akinator_backend.controller;

import com.example.cefet_akinator_backend.model.Persona;
import com.example.cefet_akinator_backend.repository.PersonaRepository;
import com.example.cefet_akinator_backend.services.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {
    private final PersonaRepository personaRepository;
    private final PersonaService personaService;

    public PersonaController(PersonaRepository personaRepository, PersonaService personaService) {
        this.personaRepository = personaRepository;
        this.personaService = personaService;
    }

    @GetMapping
    public List<Persona> listPersonas(){
        return personaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Persona> findPersonaById(@PathVariable Long id){
        return personaRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/popularBanco")
    public ResponseEntity<String> runDBFullfilling() {
        List<Persona> personaList = personaService.populaBanco();
        personaRepository.saveAll(personaList);
        return ResponseEntity.ok("Database fullfilled successfully");
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Persona createPersona(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Persona> updatePersona(@PathVariable Long id, @RequestBody Persona persona){
        return personaRepository.findById(id)
                .map(recordFound -> {
                    recordFound.setName(persona.getName());
                    recordFound.setImgUrl(persona.getImgUrl());
                    recordFound.setCharacteristicsList(persona.getCharacteristicsList());
                    Persona personaUpdated = personaRepository.save(recordFound);
                    return ResponseEntity.ok().body(personaUpdated);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersona(@PathVariable Long id){
        return personaRepository.findById(id)
                .map(record -> {
                    personaRepository.deleteById(id);
                    return ResponseEntity.noContent().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
