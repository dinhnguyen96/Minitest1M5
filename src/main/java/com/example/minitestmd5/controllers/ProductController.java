package com.example.minitestmd5.controllers;

import com.example.minitestmd5.models.Product;
import com.example.minitestmd5.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> productList() {
        return new ResponseEntity<>(productService.lists(), HttpStatus.OK);
    }
}
