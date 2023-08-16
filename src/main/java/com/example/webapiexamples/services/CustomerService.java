package com.example.webapiexamples.services;

import com.example.webapiexamples.dao.ICustomerRepository;
import com.example.webapiexamples.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final ICustomerRepository iCustomerRepository;

    @Autowired
    public CustomerService(ICustomerRepository iCustomerRepository){
        this.iCustomerRepository = iCustomerRepository;
    }

    public Customer findByCustomerNumber(Long customerNumber){
        return iCustomerRepository.findByCustomerNumber(customerNumber);
    }

    public List<Customer> findAll(){
        return iCustomerRepository.findAll();
    }

}
