package com.example.demo.service;

import com.example.demo.entities.adresse;
import java.util.List;
import java.util.Optional;

public interface adresseService {

    adresse create(adresse adresse);

    Optional<adresse> readOne(Long id);

    List<adresse> readAll();

    void delete(Long id);


}
