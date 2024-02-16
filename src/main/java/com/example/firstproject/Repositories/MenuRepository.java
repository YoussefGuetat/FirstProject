package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Menu;
import com.example.firstproject.Entities.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float prixTotal);

}
