package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packMinute")
@Table(name = "pack_minute")
public class PackMinute {

    @Id
    private int id;
    private String minPackId;
    private String minPackName;
    private String minPackType;
    private String minPackCount;
    private String minPackDuration;
    private String minPackStatus;
    private String minPackPrice;
    private String minPackDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMinPackId() {
        return minPackId;
    }

    public void setMinPackId(String minPackId) {
        this.minPackId = minPackId;
    }

    public String getMinPackName() {
        return minPackName;
    }

    public void setMinPackName(String minPackName) {
        this.minPackName = minPackName;
    }

    public String getMinPackType() {
        return minPackType;
    }

    public void setMinPackType(String minPackType) {
        this.minPackType = minPackType;
    }

    public String getMinPackCount() {
        return minPackCount;
    }

    public void setMinPackCount(String minPackCount) {
        this.minPackCount = minPackCount;
    }

    public String getMinPackDuration() {
        return minPackDuration;
    }

    public void setMinPackDuration(String minPackDuration) {
        this.minPackDuration = minPackDuration;
    }

    public String getMinPackStatus() {
        return minPackStatus;
    }

    public void setMinPackStatus(String minPackStatus) {
        this.minPackStatus = minPackStatus;
    }

    public String getMinPackPrice() {
        return minPackPrice;
    }

    public void setMinPackPrice(String minPackPrice) {
        this.minPackPrice = minPackPrice;
    }

    public String getMinPackDescription() {
        return minPackDescription;
    }

    public void setMinPackDescription(String minPackDescription) {
        this.minPackDescription = minPackDescription;
    }

}
