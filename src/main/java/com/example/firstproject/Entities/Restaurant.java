package com.example.firstproject.Entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "Restaurant")
public class Restaurant{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idRestaurant")
    private Long idRestaurant; // Clé primaire
    private String nom;
    private Long nbPlacesMax;
    @ManyToOne
    ChaineRestauration chaineRestauration;
    @OneToMany
    ArrayList<Menu> menus;
}