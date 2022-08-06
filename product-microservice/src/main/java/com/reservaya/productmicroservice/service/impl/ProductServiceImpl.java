package com.reservaya.productmicroservice.service.impl;

import com.reservaya.productmicroservice.entity.ProductEntity;
import com.reservaya.productmicroservice.repository.ProductRepository;
import com.reservaya.productmicroservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<ProductEntity> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<ProductEntity> getProductById(String idProduct) {
        return productRepository.findById(idProduct);
    }
    @Override
    public ProductEntity saveProduct(ProductEntity purchaseEntity) {
        return productRepository.save(purchaseEntity);
    }
    @Override
    public ProductEntity updateProduct(ProductEntity purchaseEntity) {
        return productRepository.save(purchaseEntity);
    }
    @Override
    public String deleteProductById(String idProduct) {
        Optional<ProductEntity> purchaseOBJ = productRepository.findById(idProduct);
        if(purchaseOBJ.isPresent()) {
            productRepository.deleteById(idProduct);
            return "Producto eliminado con id: "+idProduct;
        }else {
            return "Producto no encontrado con id: "+idProduct;
        }
    }
}

