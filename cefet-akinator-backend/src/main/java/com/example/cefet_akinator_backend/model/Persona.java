package com.example.cefet_akinator_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "personas")
@Data
public class Persona {
    String imgUrl;
    List<Boolean> characteristicsList;
}
