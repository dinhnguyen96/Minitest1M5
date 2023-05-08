package com.example.minitestmd5.controllers;

import com.example.minitestmd5.models.Product;
import com.example.minitestmd5.service.iservice.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProduct productService;

    @GetMapping("/list")
    public ResponseEntity<List<Product>> productList() {
        return new ResponseEntity<>(productService.lists(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable("id") Long id)
    {
        productService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/updateProduct/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") Long id, @RequestBody Product product)
    {
        Optional<Product> p = productService.findOne(id);
        if (!p.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        product.setId(p.get().getId());
        return new ResponseEntity<>(productService.save(product) ,HttpStatus.OK);
    }

    @PostMapping("/createProduct")
    public ResponseEntity<Product> createProduct(@RequestBody Product product)
    {
        return new ResponseEntity<>(productService.save(product) ,HttpStatus.CREATED);
    }

    @GetMapping("/searchProduct")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("categoriesId") Long categoriesId, @RequestParam("productName") String productName, @RequestParam("productPrice") double productPrice )
    {
        List<Product> products = (List<Product>) productService.findProductsByNameOrPriceOrCategories(productName, productPrice, categoriesId);
        return new ResponseEntity<>(products ,HttpStatus.OK);
    }



}
