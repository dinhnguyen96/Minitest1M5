package com.example.minitestmd5.repository;

import com.example.minitestmd5.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Categories ,Long> {
}
