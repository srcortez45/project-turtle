package com.project.turtle.core.products;

import org.springframework.web.bind.annotation.*;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping(path="/product")
public class ProductController {

    @RequestMapping(value = "/add-product", method = RequestMethod.POST)
    public ProductDAO addProduct(@RequestBody ProductDAO product){

        return product;
    }
    
}
