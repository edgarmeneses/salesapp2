/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.SupplierController;
import com.salesapp.logic.entity.Status;
import com.salesapp.logic.entity.Supplier;
import java.util.List;

/**
 *
 * @author EDGAR MENESES
 */
public class TestQuerySuppliers {
    
    public static void main(String[] args) {
       // List list = SupplierController.findByName("a");
        
       // Supplier supplier = SupplierController.findByNit("553552-2");
        //System.out.println(supplier);
       
        System.out.println("Consulta por estado 1");
        List list = SupplierController.findByStatus("I");
        
        System.out.println(list.size());
        
        for(Object data : list){
            Supplier supplier = (Supplier) data;
            System.out.println(supplier);
        }
        
        System.out.println("Consulta por estado 2");
        
        List list2 = SupplierController.findByStatus(Status.ACTIVO);
        
        for(Object data : list2){
            Supplier supplier = (Supplier) data;
            System.out.println(supplier);
        }
    }
    
}
