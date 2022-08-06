package com.reservaya.purchasemicroservice.service;

import com.reservaya.purchasemicroservice.entity.PurchaseEntity;

import java.util.List;
import java.util.Optional;

public interface PurchaseService {
    public List<PurchaseEntity> getAll();

    public Optional<PurchaseEntity> getPurchaseById(String idPurchase);

    public String deletePurchaseById(String idPurchase);

    public PurchaseEntity save(PurchaseEntity purchaseEntity);

    public PurchaseEntity updatePurchase(PurchaseEntity purchaseEntity);
}
