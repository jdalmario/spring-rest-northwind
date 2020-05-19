package com.northwind.demo.service;

import com.northwind.demo.entities.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {


    @Autowired
    CustomerService customerService;

    @Test
    public void something() {

        for (Customer customer : customerService.getAllCustomers()) {
            System.out.println(customer);
        }
        assertThat("haha").isEqualTo("haha");
    }

}