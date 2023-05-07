package com.example.minitestmd5.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Item implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;

    private Product product;

    private int quantity;

    private Cart cart;


    public Item()
    {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false, unique = true)
    public Long getId()
    {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    @OneToOne
    @JoinColumn(name = "productID")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @ManyToOne
    @JoinColumn(name = "cartID")
    public Cart getCart()
    {
        return cart;
    }
    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
