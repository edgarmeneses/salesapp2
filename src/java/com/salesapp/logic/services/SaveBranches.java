/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.controller.BranchController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.ConverterConfig;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import java.util.ArrayList;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveBranches {
    
    public static void saveBranches(String [] locations, String NITS [], String [] names, 
            String [] address, String [] types, String [] status){
        System.out.println("Guardando datos de sucursales ...");
        ArrayList<String> dataReject =  new ArrayList<>();
        
        if(locations.length == NITS.length && locations.length == names.length &&
            locations.length == address.length && locations.length == types.length && locations.length == status.length){
            //Place place = SavePlaces.findPlace(name, type, location)
            
            for (int i = 0; i < locations.length; i++) {
                String type = types[i].toUpperCase().charAt(0)+"";
                String statusBranch = status[i].toUpperCase().charAt(0)+"";
                if(ConverterConfig.converterBranchType(type) != null && ConverterConfig.converteStatus(statusBranch) != null
                    && !locations[i].equals("") && !NITS[i].equals("") && !names[i].equals("") && !address[i].equals("")){
                    Place place = SavePlaces.findPlace(locations[i],"C",null);
                    Branch branch = findBranch(NITS[i], names[i], address[i], "NO APLICA", type, statusBranch, place);
                }else{
                    String reject = locations[i]+";"+NITS[i]+";"+names[i]+";"+address[i]+";"+types[i]+";"+status[i];
                    System.out.println("datos rechazados .....");
                    System.out.println(dataReject);
              }
            }
        }else{
            System.out.println("Los datos no tienen el mismo tamaño ----");
        }
    }
    
    private static Branch findBranch(String nit, String name, String address, String phone, String type, String status,Place place){
        return createBranch(nit, name, address, phone, type, status, place);
    }
    
    private static Branch createBranch(String nit, String name, String address, String phone, String type, String status,Place place ){
        Branch branch = BranchController.findByName(name);
         
        if(branch != null){
             return branch;
        }else{
            String firstNit = nit.substring(nit.length()-1);
            return BranchController.create(validateNIT(nit), name, address, phone, ConverterConfig.converterBranchType(type),
                     ConverterConfig.converteStatus(status), place);
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
