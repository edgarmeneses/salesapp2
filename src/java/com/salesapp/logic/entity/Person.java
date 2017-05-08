/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import static com.salesapp.logic.entity.ConverterConfig.*;

/**
 *
 * @author EDGAR MENESES
 */
public class Person implements Serializable{
    
    private int idPerson;
    private int document;
    private String middlename;
    private String lastname;
    private Date birthDate;
    private String phone;
    private String address;
    private String email;
    private String gender;
    private String personType;
    private String status;
    private String username;
    private String password;
    private ArrayList<Supplier> receipts;

    public Person() {
        this.receipts = new ArrayList<>();
    }

    public Person(int idPerson, int document, String middlename, String lastname, Date birthDate, String phone, String address, String email, Gender gender, PersonType personType, Status status, String username, String password) {
        this.idPerson = idPerson;
        this.document = document;
        this.middlename = middlename;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = converteGender(gender);
        this.personType = convertePersonType(personType);
        this.status = converteStatus(status);
        this.username = username;
        this.password = password;
        this.receipts = new ArrayList<>();
    }

    
    
    

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setGender(Gender gender){
        this.gender = converteGender(gender);
    }
    
    public PersonType personType(){
        return convertePersonType(this.personType);
    }
    private String getPersonType() {
        return personType;
    }
    

    private void setPersonType(String personType) {
        this.personType = personType;
    }
    
    public void setPersonType(PersonType personType) {
       this.personType = convertePersonType(personType);
    }

    private String getStatus() {
        return status;
    }
    
    private void setStatus(String status) {
        this.status = status;
    }
    
    public void setStatus(Status status) {
      this.status = converteStatus(status);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Supplier> getReceipts() {
        return receipts;
    }

    public void setReceipts(ArrayList<Supplier> receipts) {
        this.receipts = receipts;
    }
    
    public String getNames(){
        return this.middlename + " " + this.lastname;
    }
    
    public Status status(){
        return ConverterConfig.converteStatus(status);
    }
    
    

    @Override
    public String toString() {
        return "Person{" + "idPerson=" + idPerson + ", document=" + document + ", middlename=" + middlename + ", lastname=" + lastname + ", birthDate=" + birthDate + ", phone=" + phone + ", address=" + address + ", email=" + email + ", gender=" + converteGender(this.gender) + ", personType=" + convertePersonType(this.personType) + ", status=" + converteStatus(this.status) + ", username=" + username + ", password=" + password + '}';
    }
}
