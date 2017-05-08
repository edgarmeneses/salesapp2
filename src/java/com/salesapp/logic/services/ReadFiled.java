/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EDGAR MENESES
 */
public class ReadFiled {
    
    private static final int LAST_POSITION_HEADER = 4; // with header of file 2 in case only header of request
    
    public static ArrayList<String> read(InputStream field){
        System.out.println("read filed start ....");
        ArrayList<String> data =  new ArrayList<>();
        Scanner scanner = new Scanner(field);
        int count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
            if(count > LAST_POSITION_HEADER){
               data.add(line);
            }
            
            count++;
            
        }
        
        System.out.println(data);
      if(data.size() >= 1 ){
          data.remove(data.size()-1);
      }
      
      return data;
    }
}


