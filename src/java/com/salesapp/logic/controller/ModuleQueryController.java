/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.Place;
import com.salesapp.persistence.conf.SessionApp;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class ModuleQueryController {
    
    public static List findData (String queryHQL){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        SQLQuery query = session.createSQLQuery(queryHQL);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        //query.addEntity(String.class);
        List list = query.list();
        
        //query.addEntity(Branch.class);
        return list;
    }
    
    
    
    public static void main(String[] args) {
        //String quey = "select b.branch_name, p.place_name from places p, branches b where b.place = p.id_place and p.place_name like 'TUNJA' ";
         String quey = "select * from places p, branches b where b.place = p.id_place and p.place_name like 'TUNJA' ";
        //String quey = "select * from branches ";
        List list = ModuleQueryController.findData(quey);
        
        for (Object l : list){
            System.out.println(l);
            //if(l instanceof Branch){
              //  Branch p = (Branch) l;
               // System.out.println(p);
            //}
            //Object yourObject = (Object) SerializationUtils.deserialize(l);
        }
        System.out.println(list);
    }
}
