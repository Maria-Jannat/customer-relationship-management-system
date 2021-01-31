package com.cesurazure.crm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "packCombined")
@Table(name = "pack_combined")
public class PackCombined {

    @Id
    private int id;
    private String packCombinedId;
    private String packCombinedName;
    //    FOR SMS
    private String packCombinedSMSType;
    private String packCombinedSMSCount;
//    FOR MINUTE 
    private String packCombinedMinType;
    private String packCombinedMinCount;
//    FOR GPRS
    private String packCombinedGPRSType;
    private String packCombinedGPRSAmount;
//    FOR COMBINED PACK
    private String packCombinedDuration;
    private String packCombinedStatus;
    private String packCombinedPrice;
    private String packCombinedDescription;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackCombinedId() {
        return packCombinedId;
    }

    public void setPackCombinedId(String packCombinedId) {
        this.packCombinedId = packCombinedId;
    }

    public String getPackCombinedName() {
        return packCombinedName;
    }

    public void setPackCombinedName(String packCombinedName) {
        this.packCombinedName = packCombinedName;
    }

    public String getPackCombinedSMSType() {
        return packCombinedSMSType;
    }

    public void setPackCombinedSMSType(String packCombinedSMSType) {
        this.packCombinedSMSType = packCombinedSMSType;
    }

    public String getPackCombinedSMSCount() {
        return packCombinedSMSCount;
    }

    public void setPackCombinedSMSCount(String packCombinedSMSCount) {
        this.packCombinedSMSCount = packCombinedSMSCount;
    }

    public String getPackCombinedMinType() {
        return packCombinedMinType;
    }

    public void setPackCombinedMinType(String packCombinedMinType) {
        this.packCombinedMinType = packCombinedMinType;
    }

    public String getPackCombinedMinCount() {
        return packCombinedMinCount;
    }

    public void setPackCombinedMinCount(String packCombinedMinCount) {
        this.packCombinedMinCount = packCombinedMinCount;
    }

    public String getPackCombinedGPRSType() {
        return packCombinedGPRSType;
    }

    public void setPackCombinedGPRSType(String packCombinedGPRSType) {
        this.packCombinedGPRSType = packCombinedGPRSType;
    }

    public String getPackCombinedGPRSAmount() {
        return packCombinedGPRSAmount;
    }

    public void setPackCombinedGPRSAmount(String packCombinedGPRSAmount) {
        this.packCombinedGPRSAmount = packCombinedGPRSAmount;
    }

    public String getPackCombinedDuration() {
        return packCombinedDuration;
    }

    public void setPackCombinedDuration(String packCombinedDuration) {
        this.packCombinedDuration = packCombinedDuration;
    }

    public String getPackCombinedStatus() {
        return packCombinedStatus;
    }

    public void setPackCombinedStatus(String packCombinedStatus) {
        this.packCombinedStatus = packCombinedStatus;
    }

    public String getPackCombinedPrice() {
        return packCombinedPrice;
    }

    public void setPackCombinedPrice(String packCombinedPrice) {
        this.packCombinedPrice = packCombinedPrice;
    }

    public String getPackCombinedDescription() {
        return packCombinedDescription;
    }

    public void setPackCombinedDescription(String packCombinedDescription) {
        this.packCombinedDescription = packCombinedDescription;
    }

}
