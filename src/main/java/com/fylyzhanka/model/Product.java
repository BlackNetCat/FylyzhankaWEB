package com.fylyzhanka.model;

import javax.persistence.*;

/**
 * Created by netcat on 18.04.2015.
 */
@Entity
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    @Column
    private String productName;
    @Column
    private int productCost;

    public Product(){

    }
    public Product(int productId, String productName, int productCost) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName() {

        return productName;
    }
    public void setProductName(String productName) {

        this.productName = productName;
    }

    public int getProductCost() {

        return productCost;
    }
    public void setProductCost(int productCost) {

        this.productCost = productCost;
    }


}
