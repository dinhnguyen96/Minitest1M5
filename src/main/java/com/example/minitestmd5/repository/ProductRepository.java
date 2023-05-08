package com.example.minitestmd5.repository;

import com.example.minitestmd5.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{

//    Iterable<Product> findProductsByNameOrPriceOrCategories(@Param("productName") String productName,
//                                                                @Param("productPrice") double productPrice,
//                                                                @Param("categoriesId") Long categoriesId);

}
