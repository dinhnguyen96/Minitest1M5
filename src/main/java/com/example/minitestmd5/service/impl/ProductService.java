package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.Product;
import com.example.minitestmd5.repository.ProductRepository;
import com.example.minitestmd5.service.iservice.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductService implements IProduct {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> lists() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
           productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findOne(Long id) {
        return productRepository.findById(id);
    }
}
