package com.example.Enoca.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "customer")
@Data
public class Customer extends BaseEntity{
    private String name;
    private String email;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;



}
