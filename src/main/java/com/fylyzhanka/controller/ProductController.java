package com.fylyzhanka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;
import com.fylyzhanka.model.Product;
import com.fylyzhanka.service.ProductService;

/**
 * Created by netcat on 18.04.2015.
 */


@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/index")
    public String setupForm(Map<String, Object> map){
        Product product = new Product();
        map.put("product", product);
        map.put("productList", productService.getAllProduct());
        return "product";
    }
    @RequestMapping(value = "/product.do", method = RequestMethod.POST)
    public String doActions(@ModelAttribute Product product, BindingResult result, @RequestParam String action, Map<String, Object> map){
        Product productResult = new Product();
        switch(action.toLowerCase()){
            case "add":
                productService.add(product);
                productResult = product;
                break;
            case "edit":
                productService.edit(product);
                productResult = product;
                break;
            case "delete":
                productService.delete(product.getProductId());
                productResult = new Product();
                break;
            case "search":
                Product seaarchedProduct = productService.getProduct(product.getProductId());
                productResult = seaarchedProduct != null ? seaarchedProduct : new Product();
                break;
        }
        map.put("product", productResult);
        map.put("productList", productService.getAllProduct());
        return "product";
    }
}
