package com.example.firstproject.Repositories;

import com.example.firstproject.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
