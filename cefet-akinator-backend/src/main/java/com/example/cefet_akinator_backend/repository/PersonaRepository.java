package com.example.cefet_akinator_backend.repository;

import com.example.cefet_akinator_backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
