package com.example.cefet_akinator_backend.repository;

import com.example.cefet_akinator_backend.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
