package com.example.Enoca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "carts")
@Data
public class Cart extends BaseEntity{
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
