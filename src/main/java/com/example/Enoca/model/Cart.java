package com.example.Enoca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class Cart extends BaseEntity{
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
