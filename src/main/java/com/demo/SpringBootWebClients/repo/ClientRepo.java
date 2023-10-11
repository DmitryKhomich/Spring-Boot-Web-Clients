package com.demo.SpringBootWebClients.repo;

import com.demo.SpringBootWebClients.entity.Client;


import java.util.List;


public interface ClientRepo {
    List<Client> findAll();
}
