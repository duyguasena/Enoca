package com.example.Enoca.service;

import com.example.Enoca.model.Product;
import com.example.Enoca.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product createProduct(Product product) {
        try {
            return productRepository.save(product);
        } catch (DataAccessException e) {
            System.err.println("Veritabanı hatası: " + e.getMessage());
            throw new RuntimeException("Ürün kaydedilemedi. Lütfen tekrar deneyin.");
        }
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public String updateProduct(Long id, Product product) {
        Optional<Product> productOptional=productRepository.findById(id);
        if(productOptional.isPresent()){
            Product oldProduct=productOptional.get();
            oldProduct.setName(product.getName());
            oldProduct.setPrice(product.getPrice());
            productRepository.save(oldProduct);
            return "Success!";
        }

        return null;
    }
}
