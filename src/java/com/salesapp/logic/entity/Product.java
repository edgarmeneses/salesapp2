/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author EDGAR MENESES
 */
public class Product implements Serializable{
    
    private int idProduct;
    private String name;
    private String unitMeasure;
    private Date expirationDate;
    private int stock;
    private int quantityMin;
    private String hallmark;
    private String status;
    private Category category;    

    public Product() {
    }

    public Product(int idProduct, String name, String unitMeasure, Date expirationDate, int stock, int quantityMin, String hallmark, Status status, Category category) {
        this.idProduct = idProduct;
        this.name = name;
        this.unitMeasure = unitMeasure;
        this.expirationDate = expirationDate;
        this.stock = stock;
        this.quantityMin = quantityMin;
        this.hallmark = hallmark;
        this.asigenedStatus(status);
        this.category = category;
    }
    
    private void asigenedStatus(Status status){
        switch(status){
            case ACTIVO:
                this.status="A";
                break;
            case INACTIVO:
                this.status="I";
                break;
            default:
                break;
        }
    }
    
    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getQuantityMin() {
        return quantityMin;
    }

    public void setQuantityMin(int quantityMin) {
        this.quantityMin = quantityMin;
    }

    public String getHallmark() {
        return hallmark;
    }

    public void setHallmark(String hallmark) {
        this.hallmark = hallmark;
    }

    private String getStatus() {
        return status;
    }
    
    public Status status() {
        switch(this.status){
            case "A":
                return Status.ACTIVO;
            case "I":
                return Status.INACTIVO;
            default:
                return null;
        }
    }

    private void setStatus(String status) {
        this.status = status;
    }
    
    private void setStatus(Status status) {
        this.asigenedStatus(status);
    }
     
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", unitMeasure=" + unitMeasure + ", expirationDate=" + expirationDate + ", stock=" + stock + ", quantityMin=" + quantityMin + ", hallmark=" + hallmark + ", status=" + status() + ", category=" + category + '}';
    }    
}
