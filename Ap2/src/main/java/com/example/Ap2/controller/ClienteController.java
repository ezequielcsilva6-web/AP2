package com.example.Ap2.controller;

import com.example.Ap2.entity.ClienteEntity;
import com.example.Ap2.repository.ClienteRepository;
import com.example.Ap2.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    public List<ClienteEntity> ListarTodos() {
        return service.ListarTodos();
    }

    @PostMapping
    public ResponseEntity<Map<String, String>> salvar (@RequestBody ClienteEntity cliente) {
        service.salvarClient(cliente);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(Map.of("Mensagem", "Cliente Salvo com sucesso"));

    }
}
