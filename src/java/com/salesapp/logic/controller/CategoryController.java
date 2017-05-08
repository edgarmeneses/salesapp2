/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.Status;
import com.salesapp.persistence.conf.SessionApp;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class CategoryController {
    
    public static Category create(String name, Status status, Category subcategory){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Category category = new Category(0, name, status, subcategory);
        session.save(category);
        SessionApp.commit();
        SessionApp.close();
        return category;
    }
    
    public static List find(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Category ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List categories = query.list();
        SessionApp.close();
        return categories;
    }
    
    public static Category findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Category " +
                      "where idCategory="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List categories = query.list();
        
        if(!categories.isEmpty()){
            Category category = (Category) categories.get(0);
           // SessionApp.close();
            return category;
        }else{
            //SessionApp.close();
            return null;
        }
    }
    
}
