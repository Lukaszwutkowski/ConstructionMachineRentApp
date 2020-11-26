package com.projectfinal.finalproject.services;

import com.projectfinal.finalproject.models.Client;
import com.projectfinal.finalproject.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Optional<Client> findById(int id) {
        return clientRepository.findById(id);
    }

    public void delete(int id) { clientRepository.deleteById(id); }

    public void save(Client client) {
        clientRepository.save(client);
    }

}
