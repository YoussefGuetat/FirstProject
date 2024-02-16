package com.example.firstproject.Entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "ChefCuisinier")
public class ChefCuisinier {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChefCuisinier")
    private Long idChefCuisinier; // Clé primaire
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private TypeChef typeChef;
    @ManyToMany(mappedBy = "chefCuisinier")
    private ArrayList<Menu> menu;
}