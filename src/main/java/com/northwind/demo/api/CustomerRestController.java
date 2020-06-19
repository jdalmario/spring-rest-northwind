package com.northwind.demo.api;

import com.northwind.demo.entities.Customer;
import com.northwind.demo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@Slf4j
@RestController
public class CustomerRestController {

    @Autowired
    CustomerService servicel;

    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Customer> getCustomer(@PathVariable Integer customerId) {
        log.debug("GET CUSTOMER");
        return servicel.getByCustomerId(customerId);
    }
}
