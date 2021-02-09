package com.example.demo.service.implementation;

import com.example.demo.entities.Compte;
import com.example.demo.entities.Gestionnaire;
import com.example.demo.repositories.compteRepository;
import com.example.demo.repositories.gestionnaireRepository;
import com.example.demo.service.gestionnaireService;

import java.util.List;
import java.util.Optional;

public class gestionnaireServiceImpl implements gestionnaireService {

    private gestionnaireRepository gestionnaireRepository;

    public gestionnaireServiceImpl(gestionnaireRepository gestionnaireRepository) {
        this.gestionnaireRepository = gestionnaireRepository;
    }

    @Override
    public Gestionnaire create(Gestionnaire gestionnaire) {
        return gestionnaireRepository.save(gestionnaire);
    }

    @Override
    public Optional<Gestionnaire> readOne(Long id) {
        return gestionnaireRepository.findById(id);
    }

    @Override
    public List<Gestionnaire> readAll() {
        return gestionnaireRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        gestionnaireRepository.deleteById(id);
    }

}
