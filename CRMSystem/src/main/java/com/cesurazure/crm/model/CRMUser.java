package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "crmuser")
@Table(name = "crm_user")
public class CRMUser {

    @Id
    private int id;
    private String crmId;
    private String crmFirstName;
    private String crmLastName;
    private String role;
    private String profile;
    private String crmEmail;
    private String crmMobile;
    private String crmFax;
    private String crmWebsite;
    private String dateOfBirth;
//    Address Information of job location
    private String crmStreet;
    private String crmCity;
    private String crmState;
    private String crmZipCode;
    private String crmCountry;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCrmId() {
        return crmId;
    }

    public void setCrmId(String crmId) {
        this.crmId = crmId;
    }

    public String getCrmFirstName() {
        return crmFirstName;
    }

    public void setCrmFirstName(String crmFirstName) {
        this.crmFirstName = crmFirstName;
    }

    public String getCrmLastName() {
        return crmLastName;
    }

    public void setCrmLastName(String crmLastName) {
        this.crmLastName = crmLastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getCrmEmail() {
        return crmEmail;
    }

    public void setCrmEmail(String crmEmail) {
        this.crmEmail = crmEmail;
    }

    public String getCrmMobile() {
        return crmMobile;
    }

    public void setCrmMobile(String crmMobile) {
        this.crmMobile = crmMobile;
    }

    public String getCrmFax() {
        return crmFax;
    }

    public void setCrmFax(String crmFax) {
        this.crmFax = crmFax;
    }

    public String getCrmWebsite() {
        return crmWebsite;
    }

    public void setCrmWebsite(String crmWebsite) {
        this.crmWebsite = crmWebsite;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCrmStreet() {
        return crmStreet;
    }

    public void setCrmStreet(String crmStreet) {
        this.crmStreet = crmStreet;
    }

    public String getCrmCity() {
        return crmCity;
    }

    public void setCrmCity(String crmCity) {
        this.crmCity = crmCity;
    }

    public String getCrmState() {
        return crmState;
    }

    public void setCrmState(String crmState) {
        this.crmState = crmState;
    }

    public String getCrmZipCode() {
        return crmZipCode;
    }

    public void setCrmZipCode(String crmZipCode) {
        this.crmZipCode = crmZipCode;
    }

    public String getCrmCountry() {
        return crmCountry;
    }

    public void setCrmCountry(String crmCountry) {
        this.crmCountry = crmCountry;
    }

}
