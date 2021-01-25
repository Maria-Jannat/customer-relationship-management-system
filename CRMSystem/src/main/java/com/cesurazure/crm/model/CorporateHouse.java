package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "corporateHouse")
@Table(name = "corporate_house")
public class CorporateHouse {

    @Id
    private int id;
    private String corporateHouseId;
    private String corporateHouseName;
    private String corporateHouseType;
    private String corporateHouseTradedAs;
    private String corporateHouseISIN;
    private String corporateHouseIndustry;
    private String corporateHouseNumOfEmp;
    private String corporateHouseServices;
    private String corporateHouseRevenue;
    private String leadSource;
    private String corporateHouseContact;
    private String contactJobTitle;
    private String contactDepartment;
    private String contactEmail;
    private String contactMobile;
    private String contactFax;
    private String contactWebsite;
    private String backupContact;
    private String backupContactJobTitle;
    private String backupContactEmail;
    private String backupContactMobile;
//    CORPORATE HOUSE ADDRESS INFO
    private String corporateHouseStreet;
    private String corporateHouseCity;
    private String corporateHouseState;
    private String corporateHouseZipCode;
    private String corporateHouseCountry;
//    CONTACT ADDRESS INFO
    private String contactStreet;
    private String contactCity;
    private String contactState;
    private String contactZipCode;
    private String contactCountry;
//    DESCRIPTION 
    private String corporateHouseDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorporateHouseId() {
        return corporateHouseId;
    }

    public void setCorporateHouseId(String corporateHouseId) {
        this.corporateHouseId = corporateHouseId;
    }

    public String getCorporateHouseName() {
        return corporateHouseName;
    }

    public void setCorporateHouseName(String corporateHouseName) {
        this.corporateHouseName = corporateHouseName;
    }

    public String getCorporateHouseType() {
        return corporateHouseType;
    }

    public void setCorporateHouseType(String corporateHouseType) {
        this.corporateHouseType = corporateHouseType;
    }

    public String getCorporateHouseTradedAs() {
        return corporateHouseTradedAs;
    }

    public void setCorporateHouseTradedAs(String corporateHouseTradedAs) {
        this.corporateHouseTradedAs = corporateHouseTradedAs;
    }

    public String getCorporateHouseISIN() {
        return corporateHouseISIN;
    }

    public void setCorporateHouseISIN(String corporateHouseISIN) {
        this.corporateHouseISIN = corporateHouseISIN;
    }

    public String getCorporateHouseIndustry() {
        return corporateHouseIndustry;
    }

    public void setCorporateHouseIndustry(String corporateHouseIndustry) {
        this.corporateHouseIndustry = corporateHouseIndustry;
    }

    public String getCorporateHouseNumOfEmp() {
        return corporateHouseNumOfEmp;
    }

    public void setCorporateHouseNumOfEmp(String corporateHouseNumOfEmp) {
        this.corporateHouseNumOfEmp = corporateHouseNumOfEmp;
    }

    public String getCorporateHouseServices() {
        return corporateHouseServices;
    }

    public void setCorporateHouseServices(String corporateHouseServices) {
        this.corporateHouseServices = corporateHouseServices;
    }

    public String getCorporateHouseRevenue() {
        return corporateHouseRevenue;
    }

    public void setCorporateHouseRevenue(String corporateHouseRevenue) {
        this.corporateHouseRevenue = corporateHouseRevenue;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getCorporateHouseContact() {
        return corporateHouseContact;
    }

    public void setCorporateHouseContact(String corporateHouseContact) {
        this.corporateHouseContact = corporateHouseContact;
    }

    public String getContactJobTitle() {
        return contactJobTitle;
    }

    public void setContactJobTitle(String contactJobTitle) {
        this.contactJobTitle = contactJobTitle;
    }

    public String getContactDepartment() {
        return contactDepartment;
    }

    public void setContactDepartment(String contactDepartment) {
        this.contactDepartment = contactDepartment;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getContactWebsite() {
        return contactWebsite;
    }

    public void setContactWebsite(String contactWebsite) {
        this.contactWebsite = contactWebsite;
    }

    public String getBackupContact() {
        return backupContact;
    }

    public void setBackupContact(String backupContact) {
        this.backupContact = backupContact;
    }

    public String getBackupContactJobTitle() {
        return backupContactJobTitle;
    }

    public void setBackupContactJobTitle(String backupContactJobTitle) {
        this.backupContactJobTitle = backupContactJobTitle;
    }

    public String getBackupContactEmail() {
        return backupContactEmail;
    }

    public void setBackupContactEmail(String backupContactEmail) {
        this.backupContactEmail = backupContactEmail;
    }

    public String getBackupContactMobile() {
        return backupContactMobile;
    }

    public void setBackupContactMobile(String backupContactMobile) {
        this.backupContactMobile = backupContactMobile;
    }

    public String getCorporateHouseStreet() {
        return corporateHouseStreet;
    }

    public void setCorporateHouseStreet(String corporateHouseStreet) {
        this.corporateHouseStreet = corporateHouseStreet;
    }

    public String getCorporateHouseCity() {
        return corporateHouseCity;
    }

    public void setCorporateHouseCity(String corporateHouseCity) {
        this.corporateHouseCity = corporateHouseCity;
    }

    public String getCorporateHouseState() {
        return corporateHouseState;
    }

    public void setCorporateHouseState(String corporateHouseState) {
        this.corporateHouseState = corporateHouseState;
    }

    public String getCorporateHouseZipCode() {
        return corporateHouseZipCode;
    }

    public void setCorporateHouseZipCode(String corporateHouseZipCode) {
        this.corporateHouseZipCode = corporateHouseZipCode;
    }

    public String getCorporateHouseCountry() {
        return corporateHouseCountry;
    }

    public void setCorporateHouseCountry(String corporateHouseCountry) {
        this.corporateHouseCountry = corporateHouseCountry;
    }

    public String getContactStreet() {
        return contactStreet;
    }

    public void setContactStreet(String contactStreet) {
        this.contactStreet = contactStreet;
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    public String getContactState() {
        return contactState;
    }

    public void setContactState(String contactState) {
        this.contactState = contactState;
    }

    public String getContactZipCode() {
        return contactZipCode;
    }

    public void setContactZipCode(String contactZipCode) {
        this.contactZipCode = contactZipCode;
    }

    public String getContactCountry() {
        return contactCountry;
    }

    public void setContactCountry(String contactCountry) {
        this.contactCountry = contactCountry;
    }

    public String getCorporateHouseDescription() {
        return corporateHouseDescription;
    }

    public void setCorporateHouseDescription(String corporateHouseDescription) {
        this.corporateHouseDescription = corporateHouseDescription;
    }
}
