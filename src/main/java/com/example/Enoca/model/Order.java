package com.example.Enoca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private double totalAmount;
}
