package com.cesurazure.crm.model;

public class Case {

    private int id;
    private String caseId;
    private String caseType;
    private String caseTopic;
    private String caseOwner;
    private String caseEmail;
    private String caseMobile;
    private String caseStatus;
    private String casePriority;
    private String caseDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcaseId() {
        return caseId;
    }

    public void setcaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getcaseTopic() {
        return caseTopic;
    }

    public void setcaseTopic(String caseTopic) {
        this.caseTopic = caseTopic;
    }

    public String getcaseType() {
        return caseType;
    }

    public void setcaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getcaseOwner() {
        return caseOwner;
    }

    public void setcaseOwner(String caseOwner) {
        this.caseOwner = caseOwner;
    }

    public String getcaseEmail() {
        return caseEmail;
    }

    public void setcaseEmail(String caseEmail) {
        this.caseEmail = caseEmail;
    }

    public String getcaseMobile() {
        return caseMobile;
    }

    public void setcaseMobile(String caseMobile) {
        this.caseMobile = caseMobile;
    }

    public String getcaseStatus() {
        return caseStatus;
    }

    public void setcaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getcasePriority() {
        return casePriority;
    }

    public void setcasePriority(String casePriority) {
        this.casePriority = casePriority;
    }

    public String getcaseDescription() {
        return caseDescription;
    }

    public void setcaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }

}
