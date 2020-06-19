package com.northwind.demo;

import com.northwind.demo.exception.SomeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String index() {

        if(null != null) {
            throw new SomeException("hahaha");
        }

        return "index";
    }

    @ExceptionHandler(SomeException.class)
    public String showError(SomeException ex){

        return "haha";
    }
}
