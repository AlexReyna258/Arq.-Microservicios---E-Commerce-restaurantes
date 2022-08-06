package com.reservaya.purchasemicroservice.controller;

import com.reservaya.purchasemicroservice.entity.PurchaseEntity;
import com.reservaya.purchasemicroservice.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;

    @GetMapping
    public ResponseEntity<List<PurchaseEntity>> getAll() {
        return new ResponseEntity<List<PurchaseEntity>>(this.purchaseService.getAll(), HttpStatus.ACCEPTED);
    }


    @GetMapping(value="/{idPurchase}")
    public Optional<PurchaseEntity> getPurchaseById(@PathVariable("idPurchase") String idPurchase) {
        return purchaseService.getPurchaseById(idPurchase);
    }


    @PostMapping
    public ResponseEntity<?> save(@RequestBody PurchaseEntity purchaseEntity) {
        PurchaseEntity savedPurchase = purchaseService.save(purchaseEntity);
        System.out.println("valor: "+purchaseEntity.getIdClient());
        return ResponseEntity.ok().body(savedPurchase);
    }

    @PutMapping
    public PurchaseEntity updatePurchase(@RequestBody PurchaseEntity purchaseEntity){
        return purchaseService.updatePurchase(purchaseEntity);
    }

}
