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
    
    public static Product create(Category category, String name, String unitMeasure, int stock, String hallmark, int quantityMin,Status status){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Product product = new Product(0,category,  name, unitMeasure,stock,hallmark, quantityMin,status);
        
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
    
      
       
        public static List findAll(){
            try {
                SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Product ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
       
        List products = query.list();

        SessionApp.close();
        return products;
            } catch (Exception e) {
                return  null;
            }
        
    }
    
         public static Product findByName(String name){
             try {
                SessionApp.connect();
                Session session = SessionApp.getSession();
                String hql = "from com.salesapp.logic.entity.Product " +
                      "where name='"+name.toUpperCase()+"'";
                Query query = session.createQuery(hql);
         
                if(!query.list().isEmpty()){
                Product product = (Product) query.list().get(0);
                SessionApp.close();
                return product;
            }else{
                SessionApp.close();
                return null;
            } 
            } catch (Exception e) {
                 return null;
             }
        }
    
}
