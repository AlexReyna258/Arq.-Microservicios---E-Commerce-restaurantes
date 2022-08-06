package com.reservaya.clientmicroservice.controller;
import com.reservaya.clientmicroservice.entity.ClientEntity;
import com.reservaya.clientmicroservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientEntity> getAllClient() {
        return clientService.getAll();
    }

    @GetMapping("/{idClient}")
    @ResponseStatus(HttpStatus.OK)
    private ClientEntity getClientById(@PathVariable("idClient") String idClient) {
        return clientService.getById(idClient);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ClientEntity save(@RequestBody ClientEntity clientEntity) {
        ClientEntity savedClient = clientService.save(clientEntity);
        return savedClient;
    }

    @PutMapping
    public ClientEntity updateById(@RequestBody ClientEntity clientEntity) {
        return clientService.updateById(clientEntity);
    }

    @DeleteMapping("/{idClient}")
    public void deleteById(@PathVariable("idClient") String idClient) {
        clientService.deleteById(idClient);
    }
}
