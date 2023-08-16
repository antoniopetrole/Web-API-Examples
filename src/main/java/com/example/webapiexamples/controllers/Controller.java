package com.example.webapiexamples.controllers;

import com.example.webapiexamples.models.Customer;
import com.example.webapiexamples.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    CustomerService customerService;

    @Autowired
    public Controller(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerService.findByCustomerNumber(id);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerService.findAll();
    }

}
