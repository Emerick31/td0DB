package com.example.demo.service;


import com.example.demo.entities.Compte;

import java.util.List;
import java.util.Optional;

public interface compteService {


    Compte create(Compte creditCard);

    Optional<Compte> readOne(Long id);

    List<Compte> readAll();

    void delete(Long id);

}
