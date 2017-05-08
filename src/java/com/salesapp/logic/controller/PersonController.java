/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Gender;
import com.salesapp.logic.entity.Person;
import com.salesapp.logic.entity.PersonType;
import com.salesapp.logic.entity.Receipt;
import com.salesapp.logic.entity.Status;
import com.salesapp.persistence.conf.SessionApp;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class PersonController {
    
    public static Person createSalesAgent(int document, String middlename, String lastname,
            Date birthDate, String phone, String address, String email, Gender gender, 
            Status status, String username, String password){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Person person = new Person(1000, document, middlename, lastname, birthDate, 
                        phone, address, email, gender, PersonType.VENDEDOR, status, username, password);
        session.save(person);
        SessionApp.commit();
        SessionApp.close();
        return person;
    }
    
    public static void createBuyer(int document, String middlename, String lastname, Date birthDate,
            String phone, String address, String email, Gender gender, Status status, PersonType personType, String username, String password){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        
        Person person = new Person(0, document, middlename, lastname, birthDate, phone, address, email, gender, personType, status, username, password);
        session.save(person);
        SessionApp.commit();
        SessionApp.close();
    }
    
    public static Person findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Person " +
                      "where idPerson="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List persons = query.list();
        
         if(!persons.isEmpty()){
            Person receipt = (Person) persons.get(0);
           // SessionApp.close();
            return receipt;
        }else{
            //SessionApp.close();
            return null;
        }
    }
    
     public static List findAll(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Person ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
       
        List persons = query.list();

        SessionApp.close();
        return persons;
    }
    
    /*public static List findAll(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
       
        List suppliers = query.list();

        session.close();
        return suppliers;
    }*/
    
    /*public static Supplier findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where idSupplier="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        return (Supplier) query.list().get(0);
    }*/
    
    /*public static List findByName(String name){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Supplier "+
                      "where name like '%"+name+"%'";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List list = query.list();
        return list;
    }*/
    

}