package com.example.minitestmd5.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
public class Cart implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;
    private Long id;

    private Customer customer;

    private List<Item> itemList;


    public Cart()
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
    @JoinColumn(name = "customerID")
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
       this.customer = customer;
    }

    @OneToMany(mappedBy = "cart")
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
