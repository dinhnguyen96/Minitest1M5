package com.example.minitestmd5.service.impl;

import com.example.minitestmd5.models.Categories;
import com.example.minitestmd5.repository.CategoriesRepository;
import com.example.minitestmd5.service.iservice.ICategories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService implements ICategories {
    @Autowired
   private CategoriesRepository categoriesRepository;
    @Override
    public List<Categories> lists() {
        return categoriesRepository.findAll();
    }

    @Override
    public Categories save(Categories categories) {
        return categoriesRepository.save(categories);
    }

    @Override
    public void delete(Long id) {
        categoriesRepository.deleteById(id);
    }

    @Override
    public Optional<Categories> findOne(Long id) {
        return categoriesRepository.findById(id);
    }
}
