package com.example.Enoca.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
