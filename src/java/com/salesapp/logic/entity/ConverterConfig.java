/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesapp.logic.entity;


/**
 *
 * @author EDGAR MENESES
 */
public class ConverterConfig {
    
    public static String converteStatus(Status status){
        switch(status){
            case ACTIVO:
                return "A";
            case INACTIVO:
                return "I";
            default:
                return "I";
        }
    }
    
    public static Status converteStatus(String status){
        switch(status){
            case "A":
                return Status.ACTIVO;
            case "I":
                return Status.INACTIVO;
            default:
                return Status.INACTIVO;
        }
    }
    
    public static String converteGender(Gender gender){
        switch(gender){
            case HOMBRE:
               return "M";
            case MUJER:
                return "F";
            default:
                return null;
        }
    }
    
    public static Gender converteGender(String gender){
        switch(gender){
            case "M":
                return Gender.HOMBRE;
            case "F":
                return Gender.MUJER;
            default:
                return null;
        }
    }
    
    public static String convertePersonType(PersonType personType){
        switch(personType){
            case CLIENTE:
                return "S";
            case VENDEDOR:
                return "B";
            default:
               return "S";
        }
    }
    
    public static PersonType convertePersonType(String personType){
        switch(personType){
            case "S":
                return PersonType.VENDEDOR;
            case "B":
                return PersonType.CLIENTE;
            default:
                return PersonType.CLIENTE;
        }
    }
    
    public static PlaceType converterPlaceType(String departmentType){
        switch(departmentType){
            case "P":
                return PlaceType.PAIS;
            case "D":
                return PlaceType.DEPARTAMENTO;
            case "C":
                return PlaceType.CIUDAD;
            default:
                return PlaceType.CIUDAD;
        }
    }
    
    public static String converterPlaceType(PlaceType departmentType){
        switch(departmentType){
            case PAIS:
                return "P";
            case DEPARTAMENTO:
                return "D";
            case CIUDAD:
                return "C";
            default:
                return null;
        }
    }
    
    public static BranchType converterBranchType(String branchType){
        switch(branchType){
            case "P" :
                return BranchType.PRINCIPAL;
            case "N":
                return BranchType.SEDE;
            default:
                return BranchType.SEDE;
        }
    }
    
    public static String converterBranchType(BranchType branchType){
        switch(branchType){
            case PRINCIPAL:
                return "P";
            case SEDE:
                return "N";
             default:
                 return "N";
        }
    }
}
