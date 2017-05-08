/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.Item;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Status;
import com.salesapp.persistence.conf.SessionApp;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class ProductController {
    
    public static Product create(String name, String unitMeasure, Date expirationDate, int stock, int quantityMin, String hallmark, Status status, Category category){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Product product = new Product(0, name, unitMeasure, expirationDate, stock, quantityMin, hallmark, status, category);
        session.save(product);
        SessionApp.commit();
        SessionApp.close();
        return product;
    }
    
    public static Product findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Product " +
                      "where idProduct="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List receipts = query.list();
        
         if(!receipts.isEmpty()){
             Product product = (Product) receipts.get(0);
            //SessionApp.close();
            return product;
        }else{
            //SessionApp.close();
            return null;
        }
    }
    
}
