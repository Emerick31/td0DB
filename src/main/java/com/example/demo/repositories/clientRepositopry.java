package com.example.demo.repositories;

import com.example.demo.entities.Client;
import com.example.demo.entities.adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepositopry extends JpaRepository<Client, Long> {
}
