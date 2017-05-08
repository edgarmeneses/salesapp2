/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.persistence.conf;
import org.hibernate.Session;
/**
 *
 * @author EDGAR MENESES
 */
public class SessionApp {
    
    private static Session session = null;
    
    
    public static void connect(){
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    public static void close(){
        if(session != null){
            session.close();
        }
    }
    
    public static void commit(){
        session.beginTransaction().commit();
        System.out.println("Comiit realizado ");
    }
    
    public static Session getSession(){
        return session;
    }
}
