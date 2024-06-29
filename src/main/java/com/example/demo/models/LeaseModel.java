package com.example.demo.models;

import org.springframework.data.annotation.Id;

public class LeaseModel {
    @Id
    private String id;

    private String paid;
    private String apartmentAmenities;

    private String roommatesSituations;

    // this should be handled as bytes
    private String pictures;

    private String location;

    //type of unit (house, studio apt, dorm, 1 br, etc)
    private String unitType;

    //is utilities paid? included, avg cost?
    private String utilitiesSitutation;

    //owner info (first name, relation to university, title)
    private String ownerName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getApartmentAmenities() {
        return apartmentAmenities;
    }

    public void setApartmentAmenities(String apartmentAmenities) {
        this.apartmentAmenities = apartmentAmenities;
    }

    public String getRoommatesSituations() {
        return roommatesSituations;
    }

    public void setRoommatesSituations(String roommatesSituations) {
        this.roommatesSituations = roommatesSituations;
    }

    public String getPictures() {
        return pictures;
    }

    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public String getUtilitiesSitutation() {
        return utilitiesSitutation;
    }

    public void setUtilitiesSitutation(String utilitiesSitutation) {
        this.utilitiesSitutation = utilitiesSitutation;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
