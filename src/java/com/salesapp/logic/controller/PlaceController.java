/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.PlaceType;
import com.salesapp.persistence.conf.SessionApp;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class PlaceController {
    
    public static Place create(String name, PlaceType placeType, Place location){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Place place = new Place(0, name.toUpperCase(), placeType, location);
        session.save(place);
        SessionApp.commit();
        session.close();
        SessionApp.close();
        return place;
    }
    
    public static List findAll(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Place ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
       
        List places = query.list();

        SessionApp.close();
        return places;
    }
    
    public static Place findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Place "+
                     "where idPlace="+id;
        Query query = session.createQuery(hql);
        if(!query.list().isEmpty()){
            Place place = (Place) query.list().get(0);
           // SessionApp.close();
             return place;
        }else{
            //SessionApp.close();
            return null;
        }
       
    }
    
    public static Place findByName(String name){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Place "+
                     "where name='"+name.toUpperCase()+"'";
        Query query = session.createQuery(hql);
        
        if(!query.list().isEmpty()){
            Place place = (Place) query.list().get(0);
             SessionApp.close();
            return place;
        }else{
             SessionApp.close();
            return null;
        }
    }
    
    public static Place createPlace(String name, PlaceType placeType, String location){
        return new Place(0, name, PlaceType.PAIS, new Place(0, location, placeType,null));
    }
    
    
    public static void main(String[] args) {
        System.out.println(createPlace("Bogota", PlaceType.PAIS, "Cundinamarca"));
    }
}
