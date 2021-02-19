package dev.saranda.springsecurity.smallsecuredapp.service;

import dev.saranda.springsecurity.smallsecuredapp.model.Product;
import dev.saranda.springsecurity.smallsecuredapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
