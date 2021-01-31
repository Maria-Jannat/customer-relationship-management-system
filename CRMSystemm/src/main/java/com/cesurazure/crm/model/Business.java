package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "business")
@Table(name = "business")
public class Business {

    @Id
    private int id;
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
