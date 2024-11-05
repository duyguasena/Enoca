package com.example.Enoca.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class Product extends BaseEntity{
    private String name;
    private double price;
}
