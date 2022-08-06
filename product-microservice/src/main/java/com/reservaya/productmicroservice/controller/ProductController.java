package com.reservaya.productmicroservice.controller;
import com.reservaya.productmicroservice.entity.ProductEntity;
import com.reservaya.productmicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAll() {
        return new ResponseEntity<List<ProductEntity>>(this.productService.getAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping(value="/{idProduct}")
    public Optional<ProductEntity> getProductById(@PathVariable("idProduct") String idProduct) {
        return productService.getProductById(idProduct);
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody ProductEntity productEntity) {
        ProductEntity savedPurchase = productService.saveProduct(productEntity);
        return ResponseEntity.ok().body(savedPurchase);
    }

    @PutMapping
    public ProductEntity updateProduct(@RequestBody ProductEntity productEntity){
        return productService.updateProduct(productEntity);
    }

    @DeleteMapping(value="/{idProduct}")
    public String deleteProductById(@PathVariable("idProduct") String idProduct) {
        return productService.deleteProductById(idProduct);
    }
}
