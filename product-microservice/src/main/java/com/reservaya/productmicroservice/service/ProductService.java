package com.reservaya.productmicroservice.service;

import com.reservaya.productmicroservice.entity.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<ProductEntity> getAll();

    public Optional<ProductEntity> getProductById(String idProduct);

    public ProductEntity saveProduct(ProductEntity purchaseEntity);

    public ProductEntity updateProduct(ProductEntity purchaseEntity);

    public String deleteProductById(String idProduct);
}

