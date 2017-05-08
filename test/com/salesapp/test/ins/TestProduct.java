/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.CategoryController;
import com.salesapp.logic.controller.ProductController;
import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Status;
import java.util.Date;

/**
 *
 * @author EDGAR MENESES
 */
public class TestProduct {
    
    public static void main(String[] args) {
        Category category = CategoryController.findById(2);
        System.out.println(category);
        
        if(category != null){
            Product product = ProductController.create("Atun", "1 KG", new Date(), 40, 20, "Vancamps", Status.ACTIVO, category);
        }else{
            System.out.println("La categoria no existe ....");
        }
        
    }
    
}
