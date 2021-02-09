package com.example.demo;


//Ajouter package des entities
import com.example.demo.entities.*;


//Ajouter package des services
import com.example.demo.service.implementation.gestionnaireServiceImpl;
import com.example.demo.service.implementation.clientServiceImpl;
import com.example.demo.service.implementation.addresseServiceImpl;
import com.example.demo.service.implementation.compteServiceImpl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// Annotation des beans
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

//IoC par mutation
import org.springframework.beans.factory.annotation.Autowired;


// Pour importations des logs
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class Td0DbApplication {

    private final Logger log = LoggerFactory.getLogger(Td0DbApplication.class);



    public static void main(String[] args) {

        SpringApplication.run(Td0DbApplication.class, args);
    }

}
