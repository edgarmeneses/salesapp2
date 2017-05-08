/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import java.util.List;

/**
 *
 * @author EDGAR MENESES
 */
public class TestPlace {
    
    public static void main(String[] args) {
        
     /*   Place place1 = PlaceController.create("Colombia", PlaceType.PAIS, null);
        System.out.println("Lugar creado " + place1); */
       /* Place place2 = PlaceController.create("Boyaca", PlaceType.DEPARTAMENTO, place1);
        System.out.println("Lugar creado " + place2);
         Place place3 = PlaceController.create("Tunja", PlaceType.CIUDAD, place2);
        System.out.println("Lugar creado " + place3); */
        
        
        
        List places = PlaceController.findAll();
        
        for(Object date: places){
            Place nowPlace = (Place) date;
            System.out.println(nowPlace);
            
        }
        
        System.out.println("----------------------findbyid--------------------");
        System.out.println("");
        
        Place place = PlaceController.findByName("Colombia");
        System.out.println(place);
        //Place place3 = PlaceController.createPlace("Tunja", PlaceType.CIUDAD, PlaceController.findById(2));
    }
    
}
