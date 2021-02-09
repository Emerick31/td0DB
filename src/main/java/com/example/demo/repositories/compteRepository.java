package com.example.demo.repositories;

import com.example.demo.entities.Compte;
import com.example.demo.entities.adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface compteRepository extends JpaRepository<Compte, Long> {
}
