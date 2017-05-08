/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Receipt;
import java.io.Serializable;

/**
 *
 * @author EDGAR MENESES
 */
public class Item implements Serializable{
    private ItemId itemId;
    private Receipt receipt;
    private Product product;
    private int price;
    private int quantity;

    public Item() {
    }

    public Item(int idItem, Receipt receipt, Product product, int price, int quantityMin) {
        this.itemId = new ItemId(receipt.getIdReceipt(), product.getIdProduct());  
        this.price = price;
        this.quantity = quantityMin;
        this.receipt = receipt;
        this.product = product;
    }

    public ItemId getItemId() {
        return itemId;
    }

    public void setItemId(ItemId itemId) {
        this.itemId = itemId;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" + "itemId=" + itemId + ", receipt=" + receipt + ", product=" + product + ", price=" + price + ", quantity=" + quantity + '}';
    }
    
}
