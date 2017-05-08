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
public class Receipt implements Serializable{
    private int idReceipt;
    private Date date;
    private String receiptType;
    private Supplier supplier;
    private Person salesAgent;
    private Person buyer;
    private Branch branch;

    public Receipt() {
    }

    public Receipt(int idReceipt, Date date, Supplier supplier, Branch branch) {
        this.idReceipt = idReceipt;
        this.date = date;
        this.asignedReceiptType(ReceiptType.COMPRA);
        this.supplier = supplier;
        this.salesAgent = null;
        this.buyer = null;
        this.branch = branch;
    }

    public Receipt(int idReceipt, Date date, Person salesAgent, Person buyer, Branch branch) {
        this.idReceipt = idReceipt;
        this.date = date;
        this.asignedReceiptType(ReceiptType.VENTA);
        this.supplier = null;
        this.salesAgent = salesAgent;
        this.buyer = buyer;
        this.branch = branch;
    }
    
    private void asignedReceiptType(ReceiptType reiceiptType){
        switch(reiceiptType){
            case COMPRA:
                this.receiptType="S";
                break;
            case VENTA:
                this.receiptType="B";
                break;
            default:
                break;
        }
    }

    public int getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(int idReceipt) {
        this.idReceipt = idReceipt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String getReceiptType() {
        return receiptType;
    }
    
    public ReceiptType receiptType(){
        switch(this.receiptType){
            case "S":
                return ReceiptType.VENTA;
            case "B":
                return ReceiptType.COMPRA;
            default:
                return null;
        }
    }

    private void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }
    
     public void setReceiptType(ReceiptType receiptType) {
        this.asignedReceiptType(receiptType);
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Person getSalesAgent() {
        return salesAgent;
    }

    public void setSalesAgent(Person salesAgent) {
        this.salesAgent = salesAgent;
    }

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Receipt{" + "idReceipt=" + idReceipt + ", date=" + date + ", receiptType=" + receiptType() + ", supplier=" + supplier + ", salesAgent=" + salesAgent + ", buyer=" + buyer + ", branch=" + branch + '}';
    }
}
