package com.example.firstproject.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "Client")
public class Client{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idClient")
    private Long idClient; // Clé primaire
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private LocalDate datePremiereVisite;
    @OneToMany(mappedBy = "client")
    private ArrayList<Commande> commandes;
}