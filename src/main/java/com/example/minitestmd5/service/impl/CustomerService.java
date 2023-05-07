package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.Customer;
import com.example.minitestmd5.repository.CustomerRepository;
import com.example.minitestmd5.service.iservice.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomer {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> lists() {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
customerRepository.deleteById(id);
    }

    @Override
    public Optional<Customer> findOne(Long id) {
        return customerRepository.findById(id);
    }
}
