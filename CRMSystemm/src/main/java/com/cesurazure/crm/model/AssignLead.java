package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "assignLead")
@Table(name = "assign_lead")
public class AssignLead {

    @Id
    private int id;
//    Properties of Lead
    private String leadFirstName;
    private String leadLastName;
    private String jobTitle;
    private String leadSource;
    private String leadStatus;
    private String leadIndustry;
    private String leadCompany;
    private String leadCompanyAnnualRevenue;
    private String leadCompanyNumberOfEmployees;
    private String leadRating;
    private String leadEmail;
    private String leadMobile;
    private String leadFax;
    private String leadWebsite;
//    Lead's job location
    private String leadStreet;
    private String leadCity;
    private String leadState;
    private String leadZipCode;
    private String leadCountry;
//    Description
    private String leadDescription;
//    Properties of CRM
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
//    CRM's job location
    private String crmStreet;
    private String crmCity;
    private String crmState;
    private String crmZipCode;
    private String crmCountry;
//    Properties of Business
    private String businessName;
    private String type;
    private String tradedAs;
    private String isin;
    private String industry;
    private String founded;
    private String founder;
    private String headquarter;
    private String areaServed;
    private String keyPeople;
    private String services;
    private String revenue;
    private String businessNumOfEmployees;
    private String businessWebsite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLeadFirstName() {
        return leadFirstName;
    }

    public void setLeadFirstName(String leadFirstName) {
        this.leadFirstName = leadFirstName;
    }

    public String getLeadLastName() {
        return leadLastName;
    }

    public void setLeadLastName(String leadLastName) {
        this.leadLastName = leadLastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getLeadStatus() {
        return leadStatus;
    }

    public void setLeadStatus(String leadStatus) {
        this.leadStatus = leadStatus;
    }

    public String getLeadIndustry() {
        return leadIndustry;
    }

    public void setLeadIndustry(String leadIndustry) {
        this.leadIndustry = leadIndustry;
    }

    public String getLeadCompany() {
        return leadCompany;
    }

    public void setLeadCompany(String leadCompany) {
        this.leadCompany = leadCompany;
    }

    public String getLeadCompanyAnnualRevenue() {
        return leadCompanyAnnualRevenue;
    }

    public void setLeadCompanyAnnualRevenue(String leadCompanyAnnualRevenue) {
        this.leadCompanyAnnualRevenue = leadCompanyAnnualRevenue;
    }

    public String getLeadCompanyNumberOfEmployees() {
        return leadCompanyNumberOfEmployees;
    }

    public void setLeadCompanyNumberOfEmployees(String leadCompanyNumberOfEmployees) {
        this.leadCompanyNumberOfEmployees = leadCompanyNumberOfEmployees;
    }

    public String getLeadRating() {
        return leadRating;
    }

    public void setLeadRating(String leadRating) {
        this.leadRating = leadRating;
    }

    public String getLeadEmail() {
        return leadEmail;
    }

    public void setLeadEmail(String leadEmail) {
        this.leadEmail = leadEmail;
    }

    public String getLeadMobile() {
        return leadMobile;
    }

    public void setLeadMobile(String leadMobile) {
        this.leadMobile = leadMobile;
    }

    public String getLeadFax() {
        return leadFax;
    }

    public void setLeadFax(String leadFax) {
        this.leadFax = leadFax;
    }

    public String getLeadWebsite() {
        return leadWebsite;
    }

    public void setLeadWebsite(String leadWebsite) {
        this.leadWebsite = leadWebsite;
    }

    public String getLeadStreet() {
        return leadStreet;
    }

    public void setLeadStreet(String leadStreet) {
        this.leadStreet = leadStreet;
    }

    public String getLeadCity() {
        return leadCity;
    }

    public void setLeadCity(String leadCity) {
        this.leadCity = leadCity;
    }

    public String getLeadState() {
        return leadState;
    }

    public void setLeadState(String leadState) {
        this.leadState = leadState;
    }

    public String getLeadZipCode() {
        return leadZipCode;
    }

    public void setLeadZipCode(String leadZipCode) {
        this.leadZipCode = leadZipCode;
    }

    public String getLeadCountry() {
        return leadCountry;
    }

    public void setLeadCountry(String leadCountry) {
        this.leadCountry = leadCountry;
    }

    public String getLeadDescription() {
        return leadDescription;
    }

    public void setLeadDescription(String leadDescription) {
        this.leadDescription = leadDescription;
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

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTradedAs() {
        return tradedAs;
    }

    public void setTradedAs(String tradedAs) {
        this.tradedAs = tradedAs;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getHeadquarter() {
        return headquarter;
    }

    public void setHeadquarter(String headquarter) {
        this.headquarter = headquarter;
    }

    public String getAreaServed() {
        return areaServed;
    }

    public void setAreaServed(String areaServed) {
        this.areaServed = areaServed;
    }

    public String getKeyPeople() {
        return keyPeople;
    }

    public void setKeyPeople(String keyPeople) {
        this.keyPeople = keyPeople;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getBusinessNumOfEmployees() {
        return businessNumOfEmployees;
    }

    public void setBusinessNumOfEmployees(String businessNumOfEmployees) {
        this.businessNumOfEmployees = businessNumOfEmployees;
    }

    public String getBusinessWebsite() {
        return businessWebsite;
    }

    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

}
