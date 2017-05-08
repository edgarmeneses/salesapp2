/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author EDGAR MENESES
 */
public class Place implements Serializable{
    private int idPlace;
    private String name;
    private String placeType;
    private Place location;
    private Set<Branch> branches;
    private static final long serialVersionUID = 8193356478674716638L;

    public Place() {
        this.branches = new HashSet<Branch>();
    }

    public Place(int idPlace, String name, PlaceType placeType, Place location) {
        this.idPlace = idPlace;
        this.name = name;
        this.placeType = ConverterConfig.converterPlaceType(placeType);
        //this.asignedPlaceType(placeType);
        this.location = location;
        this.branches = new HashSet<Branch>();

    }
    
    private void asignedPlaceType(PlaceType placeType){
        switch(placeType){
            case PAIS:
                this.placeType = "P";
                break;
            case DEPARTAMENTO:
                this.placeType = "D";
                break;
            case CIUDAD:
                this.placeType = "C";
                break;
            default:
                break;
        }
    }

    public int getIdPlace() {
        return idPlace;
    }

    public void setIdPlace(int idPlace) {
        this.idPlace = idPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getPlaceType() {
        return placeType;
    }
    
    public PlaceType placeType(){
        return ConverterConfig.converterPlaceType(this.placeType);
    }

    private void setPlaceType(String placeType) {
        this.placeType = placeType;
    }
    
    private void setPlaceType(PlaceType placeType) {
        asignedPlaceType(placeType);
    }

    public Place getLocation() {
        return location;
    }
    
    public String getNameLocation(){
        if(location != null){
            return location.getName();
        }else{
            return "Sin lugar padre";
        }
    }

    public void setLocation(Place location) {
        this.location = location;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }
    
    @Override
    public String toString() {
        return "Place{" + "idPlace=" + idPlace + ", name=" + name + ", placeType=" + placeType() + ", location=" + location +'}';
    }
}
