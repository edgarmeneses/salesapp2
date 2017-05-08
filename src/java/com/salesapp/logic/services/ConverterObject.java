/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.entity.Place;
import java.util.ArrayList;

/**
 *
 * @author EDGAR MENESES
 */
public class ConverterObject {
    
    public static ArrayList<Place> toPlace(ArrayList<String> data){
        
        return null;
    }
    
     public static ArrayList converteData(ArrayList<String> data){
        ArrayList<String []> array = new ArrayList<>();
        for (String d : data){
            array.add(substractInfo(d));
        }
        return array;
    }
    
    private static String [] substractInfo(String data){
       // ArrayList<Strin>
        return data.split(";");
    }
    
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("edgar;daniela;diana");
        datos.add("camila;juan;patricia;weqeuyqwiue;iasudoiuasd");
        
        ArrayList<String []> dp = converteData(datos);
        
        for (int i = 0; i < dp.size(); i++) {
            for (int j = 0; j < dp.get(i).length; j++) {
              String [] subcadena = dp.get(i);
                System.out.println(subcadena[j]);
            }
            System.out.println("----------------------------");
        }
    }
    
}
