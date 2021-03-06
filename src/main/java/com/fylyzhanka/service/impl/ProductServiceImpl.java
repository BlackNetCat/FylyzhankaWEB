package com.fylyzhanka.service.impl;

import com.fylyzhanka.dao.ProductDao;
import com.fylyzhanka.model.Product;
import com.fylyzhanka.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by netcat on 18.04.2015.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Transactional
    public void add(Product product) {
        productDao.add(product);
    }

    @Transactional
    public void edit(Product product) {
        productDao.edit(product);
    }

    @Transactional
    public void delete(int productId) {
        productDao.delete(productId);
    }

    @Transactional
    public Product getProduct(int productId) {
        return productDao.getProduct(productId);
    }

    @Transactional
    public List getAllProduct() {
        return productDao.getAllProduct();
    }
}
