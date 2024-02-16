package com.example.firstproject.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "DetailComposant")
public class DetailComposant{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idDetailComposant")
    private Long idDetailComposant; // Clé primaire
    private Float imc;
    @Enumerated(EnumType.STRING)
    private TypeComposant typeComposant;

}