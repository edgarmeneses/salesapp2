/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.BranchController;
import com.salesapp.logic.controller.CategoryController;
import com.salesapp.logic.controller.PersonController;
import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.controller.ReceiptController;
import com.salesapp.logic.controller.SupplierController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.Category;
import com.salesapp.logic.entity.Person;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.Product;
import com.salesapp.logic.entity.Receipt;
import com.salesapp.logic.entity.Supplier;
import java.util.Date;

/**
 *
 * @author EDGAR MENESES
 */
public class TestReceipt {
     public static void main(String[] args) {
        Supplier supplier = SupplierController.findById(1);
        System.out.println(supplier);
      
        Branch branch = BranchController.findById(1);
        System.out.println(branch);
        
        Receipt receipt = ReceiptController.createReceiptBuy(new Date(), supplier, branch);
         System.out.println(receipt);
    }
}
