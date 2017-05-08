/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import java.io.Serializable;

/**
 *
 * @author EDGAR MENESES
 */
public class ItemId implements Serializable{
    private int product;
    private int receipt;

    public ItemId() {
    }

    public ItemId(int receipt, int product) {
        this.product = product;
        this.receipt = receipt;
    }

    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public int getReceipt() {
        return receipt;
    }

    public void setReceipt(int receipt) {
        this.receipt = receipt;
    }

    @Override
    public String toString() {
        return "ItemId{" + "product=" + product + ", receipt=" + receipt + '}';
    }
 
}