package com.example.demo.service.implementation;

import com.example.demo.entities.Client;
import com.example.demo.entities.Compte;
import com.example.demo.repositories.clientRepository;
import com.example.demo.repositories.compteRepository;
import com.example.demo.service.compteService;

import java.util.List;
import java.util.Optional;

public class compteServiceImpl implements compteService {

    private compteRepository compteRepository;

    public compteServiceImpl(compteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    @Override
    public Compte create(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public Optional<Compte> readOne(Long id) {
        return compteRepository.findById(id);
    }

    @Override
    public List<Compte> readAll() {
        return compteRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        compteRepository.deleteById(id);
    }

}
