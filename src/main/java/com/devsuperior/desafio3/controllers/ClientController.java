package com.devsuperior.desafio3.controllers;

import com.devsuperior.desafio3.services.ClientService;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/clients") //mapeamento da API
public class ClientController {

    private ClientService service;
}
