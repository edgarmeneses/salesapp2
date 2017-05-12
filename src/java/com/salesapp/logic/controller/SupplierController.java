/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Status;
import com.salesapp.logic.entity.Supplier;
import com.salesapp.persistence.conf.HibernateUtil;
import com.salesapp.persistence.conf.SessionApp;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.salesapp.logic.entity.ConverterConfig.*;

/**
 *
 * @author EDGAR MENESES
 */
public class SupplierController {
    
    public static Supplier create(String nit, String name,  String phone, 
            String addres, String description, Status status){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Supplier supplier = new Supplier(0, nit, name, phone, addres, description,
                status);
        session.save(supplier);
        SessionApp.commit();
        SessionApp.close();
        return supplier;
    }
    
    public static List findAll(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
       
        List suppliers = query.list();

        SessionApp.close();
        return suppliers;
    }
    
    public static Supplier findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where idSupplier="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        
        if(!query.list().isEmpty()){
            Supplier supplier = (Supplier) query.list().get(0);
            //SessionApp.close();
             return supplier;
        }else{
            //SessionApp.close();
            return null;
        }
    }
    
    public static Supplier findByName(String name){
        try {
         SessionApp.connect();
         Session session = SessionApp.getSession();
         String hql = "from com.salesapp.logic.entity.Supplier " +
                      "where name='"+name.toUpperCase()+"'";
         Query query = session.createQuery(hql);
         
         if(!query.list().isEmpty()){
             Supplier supplier = (Supplier) query.list().get(0);
              SessionApp.close();
            return supplier;
         }else{
              SessionApp.close();
             return null;
         }
        } catch (Exception e) {
            return  null;
        }
        
     }
    public static Supplier findByNit(String nit){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where nit like '"+nit+"'";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        Supplier supplier = (Supplier) query.list().get(0);
        
        if(supplier != null){
            session.close();
            return supplier;
        }else{
            session.close();
            return null;
        }
    }
    
    public static List findByStatus(String status){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where status like '"+status+"'";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List list = query.list();
        session.close();
        return list;
    }
    
     public static List findByStatus(Status status){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where status like '"+converteStatus(status)+"'";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List list = query.list();
        session.close();
        return list;
    }
    
}
