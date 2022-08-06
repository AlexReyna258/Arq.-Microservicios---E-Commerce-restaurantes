package com.reservaya.clientmicroservice.service.implement;

import ch.qos.logback.core.net.server.Client;
import com.reservaya.clientmicroservice.Repository.ClientRepository;
import com.reservaya.clientmicroservice.entity.ClientEntity;
import com.reservaya.clientmicroservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<ClientEntity> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public ClientEntity getById(String idClient) {
        return clientRepository.findById(idClient).orElse(null);
    }

    @Override
    public ClientEntity save(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity updateById(ClientEntity clientEntity) {
        return clientRepository.save(clientEntity);
    }

    @Override
    public void deleteById(String idClient) {
        clientRepository.deleteById(idClient);
    }
}
