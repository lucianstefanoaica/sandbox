package com.hometech.sandbox.controllers;

import com.hometech.sandbox.entities.Customer;
import com.hometech.sandbox.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Customer addNewCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}
