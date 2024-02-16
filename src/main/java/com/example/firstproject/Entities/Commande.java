package com.example.firstproject.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "Commande")
public class Commande implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idCommande")
    private Long idCommande; // Clé primaire
    @Temporal(TemporalType.DATE)
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;
    @ManyToOne
    Client client;
    @ManyToOne
    Menu menu;
    
}