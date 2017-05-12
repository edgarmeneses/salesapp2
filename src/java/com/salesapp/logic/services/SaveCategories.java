/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.controller.CategoryController;
import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.ConverterConfig;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import com.salesapp.logic.entity.Status;
import java.util.ArrayList;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveCategories {
    
    public static void saveCategories(String [] subcategory, String names [], String [] status){
        System.out.println("Guardando datos ...");
        ArrayList<String> dataReject = new ArrayList<>();
        
        if(subcategory.length == names.length && subcategory.length == status.length){
            for (int i = 0; i < subcategory.length; i++) {
                String type = status[i].toUpperCase().charAt(0)+"";
                if( !subcategory[i].equals("") &&  !names[i].equals("") && ( type.equals("A") || type.equals("I") )){
                    Category category = findSubCategory(subcategory[i]);
                    Category name = findCategory(names[i], type, category);
                }else{
                    String reject = subcategory[i] + ";" + names[i] + ";" + status[i];
                    dataReject.add(reject);
                }
            }
        }
        System.out.println("Datos rechasados ....");
        System.out.println(dataReject);
    }
    
    public static Category findCategory( String name , String status,Category subcategory){
        return createCategorie(subcategory, name,ConverterConfig.converteStatus(status));
    }
    
    public static Category findSubCategory(String name){
         return createCategorie( null ,name , Status.ACTIVO );
    }
    
    private static Category createCategorie(Category subcategory, String name, Status status){
        Category category = CategoryController.findByName(name);
        if(category != null){
            return category;
        }else{
            return CategoryController.create(name,status, subcategory);
        }
    }
    
    
}
