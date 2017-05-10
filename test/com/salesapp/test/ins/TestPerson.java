/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.test.ins;

import com.salesapp.logic.controller.PersonController;
import com.salesapp.logic.entity.Gender;
import com.salesapp.logic.entity.Person;
import com.salesapp.logic.entity.Status;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import javafx.scene.input.DataFormat;

/**
 *
 * @author EDGAR MENESES
 */
public class TestPerson {
    
    public static void main(String[] args) {
        //System.out.println("Persona creada " + PersonController.createSalesAgent(4536363, "Marcela", "Meneses", new GregorianCalendar(1991, 06, 22).getTime(), "5355355", "calle 34 # 32 - 12", "marcela.meneses@corre.com", Gender.MUJER, Status.ACTIVO, "marcela.m", "a123"));
        //PersonController.createSalesAgent( , );
        //System.out.println(PersonController.findById(1));
        System.out.println(PersonController.findByDocument(4536363));
    }
}
