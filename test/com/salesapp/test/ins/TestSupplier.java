/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.SupplierController;
import com.salesapp.logic.entity.Status;
import com.salesapp.logic.entity.Supplier;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author EDGAR MENESES
 */
public class TestSupplier {
    
    public static void main(String[] args) {
        
        Supplier newSupp = SupplierController.create("553552-2", "Macro", "30088882", "calle 223", "proveedor makro", Status.ACTIVO);
        System.out.println(newSupp);
        //System.out.println("Se creo el proveedor " + newSupp);
        //System.out.println("Proveedor creado " + SupplierController.create("553552-2", "Macro", "30088882", "calle 223", "proveedor makro", Status.ACTIVO));
        List suppliers = SupplierController.findAll();
        
        for (int i = 0; i < suppliers.size(); i++) {
            Supplier s = (Supplier) suppliers.get(i);
            System.out.println(s);
        }
        
        System.out.println("----------------FindById-------------------");
        Supplier supplier = SupplierController.findById(1);
        System.out.println(supplier);
        System.out.println("----------------FindByName-------------------");
        Supplier supplier2 = SupplierController.findById(1);

    }
    
}
