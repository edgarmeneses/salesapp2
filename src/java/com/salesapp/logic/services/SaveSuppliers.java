/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.controller.BranchController;
import com.salesapp.logic.controller.SupplierController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.ConverterConfig;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import com.salesapp.logic.entity.Status;
import com.salesapp.logic.entity.Supplier;
import java.util.ArrayList;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveSuppliers {
    
    public static void saveSuppliers(String nits [], String [] names, 
            String [] address, String [] phones, String [] status, String [] descriptions){
            System.out.println("Guardando datos de sucursales ...");
            ArrayList<String> dataReject =  new ArrayList<>();
        
        if(names.length == nits.length && names.length == address.length &&
            names.length == phones.length && names.length == status.length && names.length == descriptions.length){
            //Place place = SavePlaces.findPlace(name, type, location)
            
            for (int i = 0; i < names.length; i++) {
              
                String statusSuppliers = status[i].toUpperCase().charAt(0)+"";
                if(ConverterConfig.converteStatus(statusSuppliers) != null
                    && !nits[i].equals("") && !names[i].equals("") && !address[i].equals("") && !phones[i].equals("")
                        && !descriptions[i].equals("")){
                    Supplier supplier = findSupplier(nits[i], names[i], address[i], phones [i], statusSuppliers, descriptions[i]);
                }else{
                    String reject = nits[i]+";"+names[i]+";"+address[i]+";"+phones[i]+";"+status[i]+";"+descriptions[i];
                    System.out.println("datos rechazados .....");
                    System.out.println(dataReject);
              }
            }
        }else{
            System.out.println("Los datos no tienen el mismo tamaño ----");
        }
    }
    
    private static Supplier findSupplier(String nit, String name, String address, String phone ,String status,String descriptions){
        return createSupplier(nit, name, address, phone, status, descriptions);
    }
    
    private static Supplier createSupplier(String nit, String name, String address, String phone,  String status,String descriptions ){
        Supplier supplier = SupplierController.findByName(name);
         
        if(supplier != null){
             return supplier;
        }else{
            String firstNit = nit.substring(nit.length()-1);
            return SupplierController.create(validateNIT(nit), name, phone, address, descriptions, ConverterConfig.converteStatus(status));
        }
    }
    
    private static String validateNIT(String nit){
        if(nit.split("-").length > 1){
             return nit;
        }else{
            String firstNit = nit.substring(0,nit.length()-1);
            String lastNit = "-"+nit.charAt(nit.length()-1);
            return firstNit+lastNit;
       }
    }
}
