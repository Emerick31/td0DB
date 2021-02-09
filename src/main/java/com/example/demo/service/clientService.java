package com.example.demo.service;

import com.example.demo.entities.Client;

import java.util.List;
import java.util.Optional;

public interface clientService {

    Client create(Client creditCard);

    Optional<Client> readOne(Long id);

    List<Client> readAll();

    void delete(Long id);

}
