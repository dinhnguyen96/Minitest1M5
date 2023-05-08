package com.example.minitestmd5.controllers;

import com.example.minitestmd5.models.Categories;
import com.example.minitestmd5.models.Product;
import com.example.minitestmd5.service.iservice.ICategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/categories")
public class CategoriesController
{
    @Autowired
    private ICategories categoriesService;

    @GetMapping("/list")
    public ResponseEntity<List<Categories>> productList() {
        return new ResponseEntity<>(categoriesService.lists(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteCategories/{id}")
    public ResponseEntity<Product> deleteCategories(@PathVariable("id") Long id)
    {
        categoriesService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/updateCategories/{id}")
    public ResponseEntity<Categories> updateCategories(@PathVariable("id") Long id, @RequestBody Categories categories)
    {
        Optional<Categories> c = categoriesService.findOne(id);
        if (!c.isPresent()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        categories.setId(c.get().getId());
        return new ResponseEntity<>(categoriesService.save(categories) ,HttpStatus.OK);
    }

    @PostMapping("/createCategories")
    public ResponseEntity<Categories> createProduct(@RequestBody Categories categories)
    {
        return new ResponseEntity<>(categoriesService.save(categories) ,HttpStatus.CREATED);
    }
}
