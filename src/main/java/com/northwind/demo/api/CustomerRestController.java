package com.northwind.demo.api;

import com.northwind.demo.entities.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;

@Slf4j
@Controller()
public class CustomerRestController {

    @RequestMapping(value = "/customer", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer getCustomer() {
        log.debug("GET CUSTOMER");
        return new Customer();
    }
}
