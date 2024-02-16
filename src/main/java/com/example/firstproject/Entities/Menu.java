package com.example.firstproject.Entities;



import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "Menu")
public class Menu{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idMenu")
    private Long idMenu; // Clé primaire
    private String libelleMenu;
    private Float prixTotal;
    @Enumerated(EnumType.STRING)
    private TypeMenu typeMenu;
    @ManyToMany
    private ArrayList<ChefCuisinier> chefCuisinier;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Commande> commandes;
    @OneToMany(mappedBy = "menu")
    private ArrayList<Composant> composants;
}