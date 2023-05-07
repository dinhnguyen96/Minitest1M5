package com.example.minitestmd5.models;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Range;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String productCode;

    private String productName;

    private double productPrice;

    private String productImage;


    private List<Categories> categoriesList;


    public Product() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "productCode")
    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    @Column(name = "productName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Range(min = 0)
    @Column(name = "productPrice")
    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Column(name = "productImage")
    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "product_categories", joinColumns = @JoinColumn(name = "productId", referencedColumnName = "Id"),
                    inverseJoinColumns = @JoinColumn(name = "categoriesId", referencedColumnName = "Id"))
    public List<Categories> getCategoriesList() {
        return categoriesList;
    }

    public void setCategoriesList(List<Categories> categoriesList)
    {
        this.categoriesList = categoriesList;
    }
}
