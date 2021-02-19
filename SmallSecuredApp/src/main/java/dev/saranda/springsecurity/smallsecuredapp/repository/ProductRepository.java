package dev.saranda.springsecurity.smallsecuredapp.repository;

import dev.saranda.springsecurity.smallsecuredapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
