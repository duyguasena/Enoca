package com.example.Enoca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product extends BaseEntity{
    private String name;
    private double price;
}
