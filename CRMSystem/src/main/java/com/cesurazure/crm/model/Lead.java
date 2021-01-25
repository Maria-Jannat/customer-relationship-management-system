package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "lead")
@Table(name = "lead")
public class Lead {

    @Id
    private int id;
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
//    Information of job location
    private String leadStreet;
    private String leadCity;
    private String leadState;
    private String leadZipCode;
    private String leadCountry;
//    Description
    private String leadDescription;

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

}
