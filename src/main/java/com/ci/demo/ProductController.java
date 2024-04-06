package com.ci.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    public String getProduct(){
        return "Hola Jonnathan";
    }
}
