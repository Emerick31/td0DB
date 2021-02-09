package com.example.demo.repositories;

import com.example.demo.entities.Gestionnaire;
import com.example.demo.entities.adresse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface gestionnaireRepository extends JpaRepository<Gestionnaire, Long> {
}
