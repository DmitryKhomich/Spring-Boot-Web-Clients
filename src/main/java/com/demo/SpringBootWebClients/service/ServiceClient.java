package com.demo.SpringBootWebClients.service;

import com.demo.SpringBootWebClients.entity.Client;
import com.demo.SpringBootWebClients.repo.ClientRepoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceClient {
    @Autowired
    ClientRepoImp repoImp;

    public List<Client> getClientList(){
        Optional<List<Client>> optional = Optional.ofNullable(repoImp.findAll());
        return optional.orElse(Collections.emptyList());
    }
}
