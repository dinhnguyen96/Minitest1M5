package com.example.minitestmd5.service.iservice;

import com.example.minitestmd5.models.Product;
import com.example.minitestmd5.service.general.IGeneral;

public interface IProduct extends IGeneral<Product>
{
    Iterable<Product> findProductsByNameOrPriceOrCategories(String productName, double productPrice, Long categoriesId);
}
