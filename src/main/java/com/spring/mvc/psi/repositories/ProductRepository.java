package com.spring.mvc.psi.repositories;

import com.spring.mvc.psi.entities.Product;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
