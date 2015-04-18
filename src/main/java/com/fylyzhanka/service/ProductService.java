package com.fylyzhanka.service;

import com.fylyzhanka.model.Product;

import java.util.List;

/**
 * Created by netcat on 18.04.2015.
 */
public interface ProductService {
    public void add(Product product);
    public void edit(Product product);
    public void delete(int productId);
    public Product getProduct(int productId);
    public List getAllProduct();
}
