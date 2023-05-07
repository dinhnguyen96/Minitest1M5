package com.example.minitestmd5.repository;

import com.example.minitestmd5.models.Categories;
import com.example.minitestmd5.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
