package com.example.firstproject.Entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
@Entity
@Table( name = "ChaineRestauration")
public class ChaineRestauration {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idChaineRestauration")
    private Long idChaineRestauration; // Clé primaire
    private String libelle;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCreation;
    @OneToMany(mappedBy = "chaineRestauration")
    ArrayList<Restaurant> restaurants;

}