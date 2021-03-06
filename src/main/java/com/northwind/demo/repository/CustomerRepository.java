package com.northwind.demo.repository;


import com.northwind.demo.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findAll();

    Optional<Customer> findById(String id);
}
