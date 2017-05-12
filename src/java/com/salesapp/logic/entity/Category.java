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
public class Category implements Serializable{
    
    private int idCategory;
    private String name;
    private String status;
    private Category subcategory;

    public Category() {
    }

    public Category(int idCategory, String name, Status status, Category subcategory) {
        this.idCategory = idCategory;
        this.name = name.toUpperCase();
        this.status = ConverterConfig.converteStatus(status);
        this.subcategory = subcategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getStatus() {
        return status;
    }
    
    public Status status() {
      return ConverterConfig.converteStatus(this.status);
    }

    private void setStatus(String status) {
        this.status = status;
    }
    
    public void setStatus(Status status) {
       this.status = ConverterConfig.converteStatus(status);
    }

    public Category getSubcategory() {
        return subcategory;
    }
    
     public String getNameSubcategory(){
        if(subcategory != null){
            return subcategory.getName();
        }else{
            return "Sin Categoria padre";
        }
    }
     
    public void setSubcategory(Category subcategory) {
        this.subcategory = subcategory;
    }

    @Override
    public String toString() {
        return "Category{" + "idCategory=" + idCategory + ", name=" + name + ", status=" + ConverterConfig.converteStatus(this.status) + ", subcategory=" + subcategory + '}';
    }
}
