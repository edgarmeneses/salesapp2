/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.controller.ProductController;
import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.ConverterConfig;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Status;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveProducts {
    
    public static void saveProducts(String [] categories, String [] names, String  [] units, String [] stocks, String [] hallmarks,
            String [] mins ){
        
        System.out.println("Guardando datos de productos ...");
        ArrayList<String> dataReject =  new ArrayList<>();
        
        if(categories.length == names.length && categories.length == units.length &&
            categories.length == stocks.length && categories.length == categories.length && 
                categories.length == mins.length){
         
            for (int i = 0; i < categories.length; i++) {
              
                if( !names[i].equals("") && !units[i].equals("") && !stocks[i].equals("") 
                        && !hallmarks[i].equals("") && !mins[i].equals("")  && !categories[i].equals("")){
                        Category category = SaveCategories.findCategory(categories[i], "A",null );
                        Product product = findProducts(category, names[i], units[i], stocks[i],hallmarks[i],  mins[i]);
                  
                }else{
                    String reject = categories[i]+";"+names[i]+";"+units[i]+";"+stocks[i]+";"+hallmarks[i]+mins[i];
                    System.out.println("datos rechazados .....");
                    System.out.println(dataReject);
              }
            }
        }else{
            System.out.println("Los datos no tienen el mismo tamaño ----");
        }
    }
    
    
    private static Product findProducts(Category category,String name, String unitMeasure, String stock, String hallmark, String quantityMin ){
        try {
            return createProducts(category, name, unitMeasure, Integer.parseInt(stock),hallmark , Integer.parseInt(quantityMin),Status.ACTIVO);
          
        } catch (Exception e) {
            return  null;
        }
    }
    
    
    private static Product createProducts( Category category, String name, String unitMeasure, int stock,String hallmark,  int quantityMin, Status status){
        Product product = ProductController.findByName(name);    
        if(product != null){
            return product;
        }else{
            return ProductController.create( category, name, unitMeasure, stock,hallmark, quantityMin , Status.ACTIVO);
        }
    }
    
  
    
}
