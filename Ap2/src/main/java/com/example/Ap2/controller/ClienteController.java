package com.example.Ap2.controller;

import com.example.Ap2.entity.ClienteEntity;
import com.example.Ap2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class ClienteController {
    @Autowired
    private ClienteRepository repository;

    @GetMapping
    public List<ClienteEntity> ListarTodos() {
        return repository.findAll();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar (@RequestBody ClienteEntity cliente) {
        repository.save(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente Salvo com sucesso"));

    }
}
