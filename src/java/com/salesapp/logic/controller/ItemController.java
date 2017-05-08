/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.controller;

import com.salesapp.logic.entity.Item;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Receipt;
import com.salesapp.persistence.conf.SessionApp;
import java.io.Serializable;
import org.hibernate.Session;

/**
 *
 * @author EDGAR MENESES
 */
public class ItemController {
   public static Item create(int price, int quantityMin, Product product, Receipt receipt){
       SessionApp.connect();
       Session session = SessionApp.getSession();
       Item item = new Item(0, receipt, product, price, quantityMin);
       SessionApp.commit();
       SessionApp.close();
       return item;
   } 
}
