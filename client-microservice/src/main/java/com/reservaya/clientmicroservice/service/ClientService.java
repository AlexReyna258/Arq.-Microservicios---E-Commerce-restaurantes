package com.reservaya.clientmicroservice.service;

import com.reservaya.clientmicroservice.entity.ClientEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientService {
    public List<ClientEntity> getAll();

    public ClientEntity getById(String idClient);

    public ClientEntity save(ClientEntity clientEntity);

    public ClientEntity updateById(ClientEntity clientEntity);

    public void deleteById(String idClient);

    //public ClientEntity checkCredentials(String userName, String password);
}
