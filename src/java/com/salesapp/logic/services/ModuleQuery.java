/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDGAR MENESES
 */
public class ModuleQuery {
    
    public static List<String> getHeaders(String data){
        String [] dataSplit = data.split(",");
        List<String> headers = new ArrayList<>();
        
        for (String dataString : dataSplit) {
            headers.add(dataString.split("=")[0]);
        }
        return headers;
    }
    
    public static List<String> getRow(String data){
        String [] dataSplit = data.split(",");
        List<String> rows = new ArrayList<>();
        for(String dataString : dataSplit){
            rows.add(dataString.split("=")[1]);
        }
        int sRows = rows.size()-1;
        //String change = rows.get(sRows).split("}")[1];
       //rows.set(sRows,change);
        return rows;
    }
    
}
