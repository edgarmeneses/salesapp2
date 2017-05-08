/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import java.util.ArrayList;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveBranches {
    
    public static boolean saveBranches(String [] locations, String NITS [], String [] names, 
            String [] address, String [] types, String [] status){
        System.out.println("Guardando datos de sucursales ...");
        ArrayList<String> dataReject =  new ArrayList<>();
        
        if(locations.length == NITS.length && locations.length == names.length &&
                locations.length == address.length && locations.length == types.length && locations.length == status.length){
            //Place place = SavePlaces.findPlace(name, type, location)
            
            for (int i = 0; i < locations.length; i++) {
              /* if(locations[i].equals("") && NITS[i].equals("") && names[i].equals("") && address[i].equals("")
                       && types.equals("P"))  */
                
                ///Place place = SavePlaces.findPlace(locations[i], "C", null);
                
                 /*if(place != null){
                     
                 }else{
                    
                 } */
            }
        }
        
        return false;
        
    }
    
    /* 
    public static void savePlace(String [] places, String names [], String [] types){
        System.out.println("Guardando datos ...");
        ArrayList<String> dataReject = new ArrayList<>();
        
        if(places.length == names.length && places.length == types.length){
            for (int i = 0; i < places.length; i++) {
                String type = types[i].toUpperCase().charAt(0)+"";
                if( !places[i].equals("") &&  !names[i].equals("") && ( type.equals("P") || type.equals("D") || type.equals("C"))){
                    Place location = findLocation(places[i]);
                    Place place = findPlace(names[i], type, location);
                }else{
                    String reject = places[i] + ";" + names[i] + ";" + types[i];
                    dataReject.add(reject);
                }
            }
        }
        System.out.println("Datos rechasados ....");
        System.out.println(dataReject);
    }
    
    public static Place findPlace( String name , String type,Place location){
        return createPlace(name, ConverterConfig.converterPlaceType(type), location);
    }
    
    public static Place findLocation(String name){
         Place countryPlace = PlaceController.findByName("Colombia");
         return createPlace(name, PlaceType.DEPARTAMENTO, countryPlace);
    }
    
    private static Place createPlace(String name, PlaceType placeType, Place location){
        Place place = PlaceController.findByName(name);
        if(place != null){
            return place;
        }else{
            return PlaceController.create(name, placeType, location);
        }
    }
    
    */
}
