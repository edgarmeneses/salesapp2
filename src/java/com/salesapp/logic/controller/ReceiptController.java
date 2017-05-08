/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.Person;
import com.salesapp.logic.entity.PersonType;
import com.salesapp.logic.entity.Receipt;
import com.salesapp.logic.entity.Supplier;
import com.salesapp.persistence.conf.SessionApp;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class ReceiptController {
    
    public static Receipt createReceiptBuy(Date date, Supplier supplier, Branch branch){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        Receipt receipt = new Receipt(0, date, supplier, branch);
        session.save(receipt);
        SessionApp.commit();
        SessionApp.close();
        return receipt;
    }
    
    public static Receipt creatReceiptSales(Date date, Person salesAgent, Person buyer, Branch branch){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        if(salesAgent.personType().equals(PersonType.VENDEDOR) && buyer.personType().equals(PersonType.CLIENTE)){
              Receipt receipt = new Receipt(0, date, salesAgent, buyer, branch);
              session.save(receipt);
              SessionApp.commit();
              SessionApp.close();
              return receipt;
        }else{
            SessionApp.close();
            return null;
        }
    }
    
    public static Receipt findById(int id){
        SessionApp.connect();
        Session session = SessionApp.getSession();
        String hql = "from com.salesapp.logic.entity.Receipt " +
                      "where idReceipt="+id;
        System.out.println(hql);
        Query query = session.createQuery(hql);
        List receipts = query.list();
        
         if(!receipts.isEmpty()){
             Receipt receipt = (Receipt) receipts.get(0);
            //SessionApp.close();
            return receipt;
        }else{
            //SessionApp.close();
            return null;
        }
    }
}
