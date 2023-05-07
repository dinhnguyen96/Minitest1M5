package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.OrderDetail;
import com.example.minitestmd5.repository.OrderDetailRepository;
import com.example.minitestmd5.service.iservice.IOderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class OderDetail implements IOderDetail {
    @Autowired
   private OrderDetailRepository orderDetailRepository;
    @Override
    public List<OrderDetail> lists() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Long id) {
orderDetailRepository.deleteById(id);
    }

    @Override
    public Optional<OrderDetail> findOne(Long id) {
        return orderDetailRepository.findById(id);
    }
}
