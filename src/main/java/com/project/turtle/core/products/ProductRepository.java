package com.project.turtle.core.products;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductDAO,Integer> {
    
}
