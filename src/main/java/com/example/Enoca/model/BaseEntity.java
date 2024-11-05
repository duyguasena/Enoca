package com.example.Enoca.model;

import jakarta.persistence.*;
import lombok.Data;


@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
