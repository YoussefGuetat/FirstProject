package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
     List<Commande> findByClientIdClient(Long idClient);
     List<Commande> findByClientIdClientAndDateCommandeBetween(Long idClient, LocalDate date1,LocalDate date2);
     List<Commande> findByDateCommandeBetweenOrderByNoteAsc(LocalDate date1, LocalDate date2);

}
