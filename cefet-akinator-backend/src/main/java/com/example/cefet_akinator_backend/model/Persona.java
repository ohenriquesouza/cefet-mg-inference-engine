package com.example.cefet_akinator_backend.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table(name = "personas")
@Data
@Component
@Scope("prototype")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String imgUrl;

    @Column(length = 500)
    private List<Boolean> characteristicsList;

    public Persona personaPrototype(){
        return new Persona();
    }
}