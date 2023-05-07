package com.example.minitestmd5.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class Customer implements Serializable
{
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private User user;

    public Customer()
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

    @OneToOne
    @JoinColumn(name = "userId")
    public User getUser() {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
