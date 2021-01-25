package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packGPRS")
@Table(name = "pack_gprs")
public class PackGPRS {

    @Id
    private int id;
    private String gprsPackId;
    private String gprsPackName;
    private String gprsPackType;
    private String gprsPackAmount;
    private String gprsPackDuration;
    private String gprsPackStatus;
    private String gprsPackPrice;
    private String gprsPackDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGprsPackId() {
        return gprsPackId;
    }

    public void setGprsPackId(String gprsPackId) {
        this.gprsPackId = gprsPackId;
    }

    public String getGprsPackName() {
        return gprsPackName;
    }

    public void setGprsPackName(String gprsPackName) {
        this.gprsPackName = gprsPackName;
    }

    public String getGprsPackType() {
        return gprsPackType;
    }

    public void setGprsPackType(String gprsPackType) {
        this.gprsPackType = gprsPackType;
    }

    public String getGprsPackAmount() {
        return gprsPackAmount;
    }

    public void setGprsPackAmount(String gprsPackAmount) {
        this.gprsPackAmount = gprsPackAmount;
    }

    public String getGprsPackDuration() {
        return gprsPackDuration;
    }

    public void setGprsPackDuration(String gprsPackDuration) {
        this.gprsPackDuration = gprsPackDuration;
    }

    public String getGprsPackStatus() {
        return gprsPackStatus;
    }

    public void setGprsPackStatus(String gprsPackStatus) {
        this.gprsPackStatus = gprsPackStatus;
    }

    public String getGprsPackPrice() {
        return gprsPackPrice;
    }

    public void setGprsPackPrice(String gprsPackPrice) {
        this.gprsPackPrice = gprsPackPrice;
    }

    public String getGprsPackDescription() {
        return gprsPackDescription;
    }

    public void setGprsPackDescription(String gprsPackDescription) {
        this.gprsPackDescription = gprsPackDescription;
    }

}
