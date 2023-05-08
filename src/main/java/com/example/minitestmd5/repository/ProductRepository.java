package com.example.minitestmd5.repository;

import com.example.minitestmd5.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p inner join p.categoriesList c where" + " " +
            "(:productName IS NULL OR p.productName LIKE %:productName%) and" + " " +
            "c.id = :categoriesId and"+ " "+
            "(:productName IS NULL OR p.productPrice betweeN 300000 and 550000)")
    Iterable<Product> findProductsByNameOrPriceOrCategories(@Param("productName") String productName,
                                                            @Param("productPrice") double productPrice,
                                                            @Param("categoriesId") Long categoriesId);

}
