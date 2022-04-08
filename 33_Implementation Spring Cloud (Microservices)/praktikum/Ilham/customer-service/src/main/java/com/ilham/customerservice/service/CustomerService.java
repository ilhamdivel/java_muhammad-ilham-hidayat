package com.ilham.customerservice.service;

import com.ilham.customerservice.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAllCustomer();
    Optional<Customer> findCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Optional<Customer> updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);

}
