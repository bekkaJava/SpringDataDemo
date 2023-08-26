package com.springdata.springdatademo.service;


import com.springdata.springdatademo.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product findById(Integer theId);

    public void deleteById(Integer theId);

    public void save(Product p);

    public void update(Product p);

}
