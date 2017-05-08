/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.CategoryController;
import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.Status;
import java.util.List;

/**
 *
 * @author EDGAR MENESES
 */
public class TesCategory {
    public static void main(String[] args) {
        Category category1 = CategoryController.create("Alimentos", Status.ACTIVO, null);
        System.out.println("Categoria creada " + category1);
        
        Category subcategory = CategoryController.create("Enlatados", Status.ACTIVO, category1);
        System.out.println("Categoria creada " + subcategory); 
        
        List categories = CategoryController.find();
        
        for(Object data: categories){
            Category category =  (Category) data;
            System.out.println(category);
        }
    }
}
