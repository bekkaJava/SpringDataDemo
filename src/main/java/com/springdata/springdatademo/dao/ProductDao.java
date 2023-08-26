package com.springdata.springdatademo.dao;

import com.springdata.springdatademo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
