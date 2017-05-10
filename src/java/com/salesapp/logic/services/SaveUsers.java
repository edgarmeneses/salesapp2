/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.services;

import com.salesapp.logic.controller.PersonController;
import com.salesapp.logic.entity.Branch;
import com.salesapp.logic.entity.ConverterConfig;
import com.salesapp.logic.entity.Gender;
import com.salesapp.logic.entity.Person;
import com.salesapp.logic.entity.PersonType;
import com.salesapp.logic.entity.Place;
import com.salesapp.logic.entity.Status;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author EDGAR MENESES
 */
public class SaveUsers {
    public static void saveUsers(String [] documents, String lastnames [], String [] middlenames, 
            String [] genders, String [] emails, String [] phones, String [] address, String [] roles,
            String [] birthdays, String [] status, String [] username, String [] passwords ){
        System.out.println("Guardando datos de sucursales ...");
        ArrayList<String> dataReject =  new ArrayList<>();
        
        if(documents.length == lastnames.length && documents.length == middlenames.length &&
            documents.length == genders.length && documents.length == emails.length && documents.length == phones.length
                && documents.length == address.length && documents.length == roles.length && documents.length == birthdays.length
                && documents.length == status.length && documents.length == username.length && documents.length == passwords.length){
            //Place place = SavePlaces.findPlace(name, type, location)
            
            for (int i = 0; i < documents.length; i++) {
                //String type = types[i].toUpperCase().charAt(0)+"";
                String statusUser = status[i].toUpperCase().charAt(0)+"";
                String gender = genders[i].toUpperCase().charAt(0)+"";
                String tPerson = roles[i].toUpperCase().charAt(0)+"";
                if( ConverterConfig.convertePersonType(tPerson) != null && ConverterConfig.converterBranchType(statusUser) != null && ConverterConfig.converteGender(gender) != null &&
                        !lastnames[i].equals("") && !middlenames[i].equals("") && emails[i].equals("")){
                    if(phones[i].equals("")){
                        phones[i]="NO REGISTRADO";
                    }
                    
                    if(address[i].equals("")){
                        address[i] = "NO REGISTRADA";
                    }
                    
                    Person person = findUser(documents[i], middlenames[i], lastnames[i], birthdays[i], phones[i], address[i], emails[i], gender, statusUser,tPerson, username[i], passwords[i]);
                }else{
                    String reject = documents[i]+";"+lastnames[i]+";"+middlenames[i]+";"+genders[i]+";"+emails[i]+";"+phones[i]
                            +address[i]+";"+roles[i]+";"+birthdays[i]+";"+status[i]+";"+username[i]+";"+passwords[i];
                    System.out.println("datos rechazados .....");
                    System.out.println(dataReject);
              }
            }
        }else{
            System.out.println("Los datos no tienen el mismo tamaño ----");
        }
    }
    
    public static Person findUser(String document, String middlename, String lastname, String birthDate, String phone, String address,
            String email, String gender, String status, String personType, String username, String password){
        try{
            return CreateUser(Integer.parseInt(document), middlename, lastname, new Date(birthDate), phone, address, email, ConverterConfig.converteGender(gender), ConverterConfig.converteStatus(status), ConverterConfig.convertePersonType(personType), username, password);
        }catch(Exception e){
            return null;
        }
    }
    
    private static Person CreateUser(int document, String middlename, String lastname, Date birthDate,
            String phone, String address, String email, Gender gender, Status status, PersonType personType, String username, String password){
        Person person = PersonController.findByDocument(document);
        if(person != null){
            return person;
        }else{
            return PersonController.createEmployee(document, middlename, lastname, birthDate, phone, address, email, gender, status, personType, username, password);
        }
    }
}
