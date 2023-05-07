package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.Cart;
import com.example.minitestmd5.repository.CartRepository;
import com.example.minitestmd5.service.iservice.ICart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CartService implements ICart {
    @Autowired
   private CartRepository cartRepository;
    @Override
    public List<Cart> lists() {
        return cartRepository.findAll();
    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void delete(Long id) {
cartRepository.deleteById(id);
    }

    @Override
    public Optional<Cart> findOne(Long id) {
        return cartRepository.findById(id);
    }
}
