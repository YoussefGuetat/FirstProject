package com.example.firstproject.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "Composant")
public class Composant{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idComposant")
    private Long idComposant; // Clé primaire
    private String nomComposant;
    private Float prix;
    @ManyToOne
    Menu menu;
    @OneToOne
    DetailComposant detailComposant;
}