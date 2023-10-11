package com.demo.SpringBootWebClients.controller;

import com.demo.SpringBootWebClients.service.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ClientsController {

    @Autowired
    ServiceClient serviceClient;

    @GetMapping("/")
    public String showAll (Model model){
        model.addAttribute("clients",serviceClient.getClientList());
        return "home";
    }
}

