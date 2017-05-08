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
public class Branch implements Serializable{
    private int idBranch;
    private String nit;
    private String name;
    private String address;
    private String phone;
    private String branchType;
    private String status;
    private Place place;
    private static final long serialVersionUID = 8799656478674716638L;

    public Branch() {
    }

    public Branch(int idBranch, String nit, String name, String address, String phone, BranchType branchType, Status status, Place place) {
        this.idBranch = idBranch;
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.status = ConverterConfig.converteStatus(status);
        this.branchType = ConverterConfig.converterBranchType(branchType);
        this.place = place;
    }
    
    public String getLocationName(){
        if(this.place != null){
            return place.getName();
        }else{
            return "Sin Especificar";
        }
    }

    public int getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(int idBranch) {
        this.idBranch = idBranch;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String getBranchType() {
        return branchType;
    }
    
    public BranchType branchType(){
        return ConverterConfig.converterBranchType(this.branchType);
    }

    private void setBranchType(String branchType) {
        this.branchType = branchType;
    }
    
    public void setBranchType(BranchType branchType){
        this.branchType = ConverterConfig.converterBranchType(branchType);
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
    
    private void setSatatus(Status status){
        this.status = ConverterConfig.converteStatus(status);
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Branch{" + "idBranch=" + idBranch + ", nit=" + nit + ", name=" + name + ", address=" + address + ", phone=" + phone + ", branchType=" + branchType() + ", status=" + status() + ", place=" + place + '}';
    }
}
