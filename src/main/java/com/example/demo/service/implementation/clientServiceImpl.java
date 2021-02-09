package com.example.demo.service.implementation;

import com.example.demo.entities.Client;
import com.example.demo.repositories.clientRepository;
import com.example.demo.service.clientService;

import java.util.List;
import java.util.Optional;

public class clientServiceImpl implements clientService {

    private final clientRepository clientRepository;

    public clientServiceImpl(clientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> readOne(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> readAll() {
        return clientRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

}
