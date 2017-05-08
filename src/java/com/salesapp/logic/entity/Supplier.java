/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import java.io.Serializable;
import static com.salesapp.logic.entity.ConverterConfig.*;

/**
 *
 * @author EDGAR MENESES
 */
public class Supplier implements Serializable{
    
    private int idSupplier;
    private String nit;
    private String name;
    private String phone;
    private String address;
    private String description;
    private String status;

    public Supplier() {
    }

    public Supplier(int idSupplier, String nit, String name, String phone, String address, String description, Status status) {
        this.idSupplier = idSupplier;
        this.nit = nit;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.description = description;
        this.status= converteStatus(status);
    }
    
   

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    private String getStatus(){
        return this.status;
    }
    
    

    public void setStatus(Status status) {
        this.status = converteStatus(status);
    }
    
    private void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Supplier{" + "idSupplier=" + idSupplier + ", nit=" + nit + ", name=" + name + ", phone=" + phone + ", address=" + address + ", description=" + description + ", status=" + converteStatus(this.status) + '}';
    }
}
