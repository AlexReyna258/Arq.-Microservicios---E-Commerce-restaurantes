package com.reservaya.clientmicroservice.Repository;

import com.reservaya.clientmicroservice.entity.ClientEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientEntity, String> {

}
