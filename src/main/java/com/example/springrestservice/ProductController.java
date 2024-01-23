package com.example.springrestservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProductController {
    public static Map<Object, Product> productController = new HashMap<>();

    static {
        Product dellLaptop = new Product();
        dellLaptop.setProductID(1);
        dellLaptop.setProductName("Dell Inspiron");
        productController.put(dellLaptop.getProductID(), dellLaptop);

        Product hpLaptop = new Product();
        hpLaptop.setProductID(2);
        hpLaptop.setProductName("HP Pavilion");
        productController.put(hpLaptop.getProductID(), hpLaptop);

        Product lenovoLaptop = new Product();
        lenovoLaptop.setProductID(3);
        lenovoLaptop.setProductName("Lenovo ThinkPad");
        productController.put(lenovoLaptop.getProductID(), lenovoLaptop);

    }

    @RequestMapping(value = "/allProducts")
    public ResponseEntity<Object> getProduct() {
        return new ResponseEntity<>(productController.values(), HttpStatus.OK);
    }

}
