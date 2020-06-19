package com.northwind.demo.service;

import com.northwind.demo.entities.Customer;
import com.northwind.demo.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Slf4j
@Transactional
@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        log.debug("GET all CUSTOMERS");
        return customerRepository.findAll();
    }

    public Optional<Customer> getByCustomerId(int id) {
        Optional<Customer> customerOptional = this.customerRepository.findById(id);
        return customerOptional;
    }
}
