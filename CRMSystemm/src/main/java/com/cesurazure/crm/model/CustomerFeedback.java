package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "customerFeedback")
@Table(name = "customer_feedback")
public class CustomerFeedback {

    @Id
    private int id;
    private String customerMobile;
    private String customerEmail;
    private String customerOpinionOnServices;
    private String customerOpinionReason;
    private String customerSatisfactionLevel;
    private String customerOtherOpinion;
    private String customerAudioClip;

//    SERVICE INFO
    private String serviceCode;
    private String serviceType;
    private String serviceName;
    private String serviceRate;
    private String serviceStatus;
    private String serviceDescription;

//    BUSINESS INFO
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

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerOpinionOnServices() {
        return customerOpinionOnServices;
    }

    public void setCustomerOpinionOnServices(String customerOpinionOnServices) {
        this.customerOpinionOnServices = customerOpinionOnServices;
    }

    public String getCustomerOpinionReason() {
        return customerOpinionReason;
    }

    public void setCustomerOpinionReason(String customerOpinionReason) {
        this.customerOpinionReason = customerOpinionReason;
    }

    public String getCustomerSatisfactionLevel() {
        return customerSatisfactionLevel;
    }

    public void setCustomerSatisfactionLevel(String customerSatisfactionLevel) {
        this.customerSatisfactionLevel = customerSatisfactionLevel;
    }

    public String getCustomerOtherOpinion() {
        return customerOtherOpinion;
    }

    public void setCustomerOtherOpinion(String customerOtherOpinion) {
        this.customerOtherOpinion = customerOtherOpinion;
    }

    public String getCustomerAudioClip() {
        return customerAudioClip;
    }

    public void setCustomerAudioClip(String customerAudioClip) {
        this.customerAudioClip = customerAudioClip;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(String serviceRate) {
        this.serviceRate = serviceRate;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
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
