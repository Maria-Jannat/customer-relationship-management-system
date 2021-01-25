package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packSMS")
@Table(name = "pack_sms")
public class PackSMS {

    @Id
    private int id;
    private String smsPackId;
    private String smsPackName;
    private String smsPackType;
    private String smsPackCount;
    private String smsPackDuration;
    private String smsPackStatus;
    private String smsPackPrice;
    private String smsPackDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSmsPackId() {
        return smsPackId;
    }

    public void setSmsPackId(String smsPackId) {
        this.smsPackId = smsPackId;
    }

    public String getSmsPackName() {
        return smsPackName;
    }

    public void setSmsPackName(String smsPackName) {
        this.smsPackName = smsPackName;
    }

    public String getSmsPackType() {
        return smsPackType;
    }

    public void setSmsPackType(String smsPackType) {
        this.smsPackType = smsPackType;
    }

    public String getSmsPackCount() {
        return smsPackCount;
    }

    public void setSmsPackCount(String smsPackCount) {
        this.smsPackCount = smsPackCount;
    }

    public String getSmsPackDuration() {
        return smsPackDuration;
    }

    public void setSmsPackDuration(String smsPackDuration) {
        this.smsPackDuration = smsPackDuration;
    }

    public String getSmsPackStatus() {
        return smsPackStatus;
    }

    public void setSmsPackStatus(String smsPackStatus) {
        this.smsPackStatus = smsPackStatus;
    }

    public String getSmsPackPrice() {
        return smsPackPrice;
    }

    public void setSmsPackPrice(String smsPackPrice) {
        this.smsPackPrice = smsPackPrice;
    }

    public String getSmsPackDescription() {
        return smsPackDescription;
    }

    public void setSmsPackDescription(String smsPackDescription) {
        this.smsPackDescription = smsPackDescription;
    }
}
