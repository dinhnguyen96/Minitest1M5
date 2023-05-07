package com.example.minitestmd5.models;


import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Categories implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;


    private Long id;

    private String categoriesCode;

    private String categoriesName;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", unique = true, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="categoriesCode")
    public String getCategoriesCode() {
        return categoriesCode;
    }

    public void setCategoriesCode(String categoriesCode) {
        this.categoriesCode = categoriesCode;
    }

    @Column(name="categoriesName")
    public String getCategoriesName() {
        return categoriesName;
    }

    public void setCategoriesName(String categoriesName) {
        this.categoriesName = categoriesName;
    }
}
