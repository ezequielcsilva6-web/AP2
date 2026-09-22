package com.example.Ap2.service;

import com.example.Ap2.entity.ClienteEntity;
import com.example.Ap2.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public List<ClienteEntity> ListarTodos() {
        return repository.findAll();
    }

    public ClienteEntity salvarClient(ClienteEntity cliente) {
        if (repository.findByEmail(cliente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Cliente não encontrado.");
        }
        return repository.save(cliente);
    }
}
