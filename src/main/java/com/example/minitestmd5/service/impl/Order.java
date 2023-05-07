package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.repository.OrderRepository;
import com.example.minitestmd5.service.iservice.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class Order implements IOrder{
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public List<com.example.minitestmd5.models.Order> lists() {
        return orderRepository.findAll();
    }

    @Override
    public com.example.minitestmd5.models.Order save(com.example.minitestmd5.models.Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void delete(Long id) {
orderRepository.deleteById(id);
    }

    @Override
    public Optional<com.example.minitestmd5.models.Order> findOne(Long id) {
        return orderRepository.findById(id);
    }
}
