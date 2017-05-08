/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.ItemController;
import com.salesapp.logic.controller.ProductController;
import com.salesapp.logic.controller.ReceiptController;
import com.salesapp.logic.entity.Item;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Receipt;

/**
 *
 * @author EDGAR MENESES
 */
public class TestItem {
    public static void main(String[] args) {
        Product product = ProductController.findById(1);
        System.out.println(product);
        Receipt receipt = ReceiptController.findById(1);
        System.out.println(receipt);
        
        Item item = ItemController.create(4500,20 , product, receipt);
        System.out.println("item creado " + item);
    }
}
