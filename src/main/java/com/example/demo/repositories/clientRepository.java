package com.example.demo.repositories;

import com.example.demo.entities.Client;
import com.example.demo.entities.adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<Client, Long> {
}
