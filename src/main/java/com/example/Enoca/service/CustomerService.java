package com.example.Enoca.service;

import com.example.Enoca.model.Customer;
import com.example.Enoca.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Object saveCustomer(Customer customer) {
        if (customerRepository.existsByEmail(customer.getEmail())) {
            throw new RuntimeException("Bu e-posta adresi ile zaten kayıtlı bir müşteri var: " + customer.getEmail());
        }
        return customerRepository.save(customer);
    }
}
