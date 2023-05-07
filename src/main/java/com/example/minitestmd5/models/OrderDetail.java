package com.example.minitestmd5.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;


    private Order order;

    private Product product;

    private int quantity;

    private double amount;


    public OrderDetail()
    {

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


    @ManyToOne
    @JoinColumn(name="orderId")
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }


    @ManyToOne
    @JoinColumn(name="productId")
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

    @Column(name = "amount")
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }
}
