package com.ilham.customerservice.service.impl;

import com.ilham.customerservice.model.Customer;
import com.ilham.customerservice.repository.CustomerRepository;
import com.ilham.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> findAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> updateCustomer(Long id, Customer customer) {
        Optional<Customer> customerById = this.findCustomerById(id);

        customerById.ifPresent(res -> {
            res.setName(customer.getName());
            res.setEmail(customer.getEmail());

            customerRepository.save(res);
        });
        return customerById;
    }

    @Override
    public void deleteCustomer(Long id) {
        Optional<Customer> customerById = this.findCustomerById(id);
        customerById.ifPresent(customerRepository::delete);
    }
}
