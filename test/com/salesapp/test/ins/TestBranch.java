/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.BranchController;
import com.salesapp.logic.controller.PlaceController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.BranchType;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.Status;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EDGAR MENESES
 */
public class TestBranch {
    public static void main(String[] args) {
        Place place = PlaceController.findByName("TUNJA");
        
        Branch branch = BranchController.create("7238833", "Autorolling", "calle 1234", "493993993", BranchType.PRINCIPAL, Status.ACTIVO, place);
        System.out.println("Se creo la sucursal " + branch); 
        
        Branch branch2 = BranchController.create("7231283", "Autorolling2", "calle 1234", "493993993", BranchType.PRINCIPAL, Status.ACTIVO, place);
        System.out.println("Se creo la sucursal " + branch); 
        
        Branch branch3 = BranchController.create("5737377", "Autorolling3", "calle 1234", "493993993", BranchType.PRINCIPAL, Status.ACTIVO, place);
        System.out.println("Se creo la sucursal " + branch); 
        
        
       /* List branches = BranchController.findAll();
        
        for (Object data : branches) {
            Branch branch = (Branch) data;
            System.out.println(branch);
        }*/
        
    }
}
