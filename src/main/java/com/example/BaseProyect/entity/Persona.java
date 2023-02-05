package com.example.BaseProyect.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persona")
public class Persona {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "numero")
    private int numero;

    @Column(name = "email")
    private String email;

    @Column( name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updatet_at")
    private LocalDateTime updatedAT;

}

