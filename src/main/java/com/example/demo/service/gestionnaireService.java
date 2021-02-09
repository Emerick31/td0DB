package com.example.demo.service;


import com.example.demo.entities.Gestionnaire;

import java.util.List;
import java.util.Optional;

public interface gestionnaireService {

    Gestionnaire create(Gestionnaire creditCard);

    Optional<Gestionnaire> readOne(Long id);

    List<Gestionnaire> readAll();

    void delete(Long id);

}
