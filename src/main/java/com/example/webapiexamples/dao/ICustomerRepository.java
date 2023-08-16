package com.example.webapiexamples.dao;

import com.example.webapiexamples.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ICustomerRepository extends CrudRepository<Customer, Long> {
    public Customer findByCustomerNumber(Long customerNumber);
    public List<Customer> findAll();
}
