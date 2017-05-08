/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.BranchType;
import com.salesapp.logic.entity.Place;
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
public class BranchController {
    
    public static Branch create(String nit, String name, String address, String phone, BranchType branchType, Status status, Place place){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Branch branch = new Branch(0, nit, name, address, phone,branchType, status, place);
        session.save(branch);
        SessionApp.commit();
        SessionApp.close();
        return branch;
    }
    
    public static List findAll(){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Branch ";
        System.out.println(hql);
        Query query = session.createQuery(hql);
        
        List branches = query.list();
        SessionApp.close();
        return branches;
    }
    
     public static Branch findById(int id){
        SessionApp.connect();
        
        Session session = SessionApp.getSession();
         System.out.println(session);
        String hql = "from com.salesapp.logic.entity.Branch " +
                      "where idBranch="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        
        //if(!query.list().isEmpty()){
            Branch branch = (Branch) query.list().get(0);
            //session.close();
            return branch;
        //}else{
          //  SessionApp.close();
           // return null;
       // }
    }
}
