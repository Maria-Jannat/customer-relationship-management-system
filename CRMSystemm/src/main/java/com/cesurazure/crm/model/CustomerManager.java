package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "cm")
@Table(name = "customer_manager")
public class CustomerManager {

    @Id
    private int id;
    private String cmId;
    private String cmFirstName;
    private String cmLastName;
    private String cmRole;  //designation  
    private String cmProfile;   //standart or administrator 
    private String cmJobLocation;
    private String cmEmail;
    private String cmMobile;
    private String cmFax;
    private String cmWebsite;
    private String cmDateOfBirth;
//    Address Information 
    private String cmStreet;
    private String cmCity;
    private String cmState;
    private String cmZipCode;
    private String cmCountry;
//    DESCRIPTION
    private String cmDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCmId() {
        return cmId;
    }

    public void setCmId(String cmId) {
        this.cmId = cmId;
    }

    public String getCmFirstName() {
        return cmFirstName;
    }

    public void setCmFirstName(String cmFirstName) {
        this.cmFirstName = cmFirstName;
    }

    public String getCmLastName() {
        return cmLastName;
    }

    public void setCmLastName(String cmLastName) {
        this.cmLastName = cmLastName;
    }

    public String getCmRole() {
        return cmRole;
    }

    public void setCmRole(String cmRole) {
        this.cmRole = cmRole;
    }

    public String getCmProfile() {
        return cmProfile;
    }

    public void setCmProfile(String cmProfile) {
        this.cmProfile = cmProfile;
    }

    public String getCmJobLocation() {
        return cmJobLocation;
    }

    public void setCmJobLocation(String cmJobLocation) {
        this.cmJobLocation = cmJobLocation;
    }

    public String getCmEmail() {
        return cmEmail;
    }

    public void setCmEmail(String cmEmail) {
        this.cmEmail = cmEmail;
    }

    public String getCmMobile() {
        return cmMobile;
    }

    public void setCmMobile(String cmMobile) {
        this.cmMobile = cmMobile;
    }

    public String getCmFax() {
        return cmFax;
    }

    public void setCmFax(String cmFax) {
        this.cmFax = cmFax;
    }

    public String getCmWebsite() {
        return cmWebsite;
    }

    public void setCmWebsite(String cmWebsite) {
        this.cmWebsite = cmWebsite;
    }

    public String getCmDateOfBirth() {
        return cmDateOfBirth;
    }

    public void setCmDateOfBirth(String cmDateOfBirth) {
        this.cmDateOfBirth = cmDateOfBirth;
    }

    public String getCmStreet() {
        return cmStreet;
    }

    public void setCmStreet(String cmStreet) {
        this.cmStreet = cmStreet;
    }

    public String getCmCity() {
        return cmCity;
    }

    public void setCmCity(String cmCity) {
        this.cmCity = cmCity;
    }

    public String getCmState() {
        return cmState;
    }

    public void setCmState(String cmState) {
        this.cmState = cmState;
    }

    public String getCmZipCode() {
        return cmZipCode;
    }

    public void setCmZipCode(String cmZipCode) {
        this.cmZipCode = cmZipCode;
    }

    public String getCmCountry() {
        return cmCountry;
    }

    public void setCmCountry(String cmCountry) {
        this.cmCountry = cmCountry;
    }

    public String getCmDescription() {
        return cmDescription;
    }

    public void setCmDescription(String cmDescription) {
        this.cmDescription = cmDescription;
    }

}
