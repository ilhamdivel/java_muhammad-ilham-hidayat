package com.ilham.customerservice.controller;

import com.ilham.customerservice.model.Customer;
import com.ilham.customerservice.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer-service")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomer() {
        return customerService.findAllCustomer();
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getById(@PathVariable Long id) {
        return customerService.findCustomerById(id);
    }

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.createCustomer(customer);
    }

    @PutMapping("/customer/{id}")
    public Optional<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id,customer);
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
    }


}
