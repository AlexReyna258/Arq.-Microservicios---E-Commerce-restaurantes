package com.reservaya.purchasemicroservice.service.impl;

import com.reservaya.purchasemicroservice.entity.PurchaseEntity;
import com.reservaya.purchasemicroservice.repository.PurchaseRepository;
import com.reservaya.purchasemicroservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public List<PurchaseEntity> getAll() {
        return purchaseRepository.findAll();
    }

    @Override
    public Optional<PurchaseEntity> getPurchaseById(String idPurchase) {
        return purchaseRepository.findById(idPurchase);
    }

    @Override
    public String deletePurchaseById(String idPurchase) {
        Optional<PurchaseEntity> purchaseOBJ = purchaseRepository.findById(idPurchase);
        if(purchaseOBJ.isPresent()) {
            purchaseRepository.deleteById(idPurchase);
            return "Producto eliminado con id: "+idPurchase;
        }else {
            return "Producto no encontrado con id: "+idPurchase;
        }
    }
    @Override
    public PurchaseEntity save(PurchaseEntity purchaseEntity) {
        return purchaseRepository.save(purchaseEntity);
    }

    @Override
    public PurchaseEntity updatePurchase(PurchaseEntity purchaseEntity) {
        return purchaseRepository.save(purchaseEntity);
    }



    /*@Override
    @Transactional(readOnly = false)
    public PurchaseEntity save(PurchaseEntity purchaseEntity) {

        purchaseEntity.setFecha(new Date());

        // Calcular el total de los productos
        purchaseEntity.setTotal(
                purchaseEntity.getListaDetalleCompra()
                        .stream()
                        .mapToDouble(detalle -> {
                            // Calcula precio del producto * cantidad
                            Producto producto = productoService.getById(detalle.getProducto().getPk());
                            detalle.setPrecio(producto.getPrecio());
                            detalle.setTotal(producto.getPrecio() * detalle.getCantidad());

                            return detalle.getTotal();
                        })
                        .sum()
        );

        // Actualizar stock de cada producto
        compra.getListaDetalleCompra()
                .forEach(detalle -> productoService.updateStock(detalle.getProducto().getPk(), detalle.getCantidad()));

        compraDao.save(compra);

        compra.getListaDetalleCompra().forEach(detalleCompra -> {
            detalleCompra.setCompra(compra);
            detalleCompraDao.save(detalleCompra);
        });
        return compra;
    }*/
}
