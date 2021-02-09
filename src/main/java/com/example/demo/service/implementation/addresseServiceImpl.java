package com.example.demo.service.implementation;

import com.example.demo.entities.adresse;
import com.example.demo.repositories.adresseRepository;
import com.example.demo.service.adresseService;

import java.util.List;
import java.util.Optional;

public class addresseServiceImpl implements adresseService {


    private final adresseRepository addressRepository;

    public addresseServiceImpl(adresseRepository addressRepository) {
        this.addressRepository = addressRepository;
    }


    @Override
    public adresse create(adresse address) {
        return addressRepository.save(address);
    }

    @Override
    public Optional<adresse> readOne(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<adresse> readAll() {
        return addressRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    }

