package com.example.demo.models;

import jakarta.persistence.*;

@Entity
@Table(name="leases")
public class LeaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leases_seq")
    @SequenceGenerator(name = "leases_seq", sequenceName = "leases_seq", allocationSize = 1)
    private Long id;

    @Column(name="paid")
    private String paid;

    @Column(name="apartmentamenities")
    private String apartmentAmenities;

    @Column(name="roommatessituations")
    private String roommatesSituations;

    @Column(name="pictures")
    private String pictures;

    @Column(name="location")
    private String location;

    //type of unit (house, studio apt, dorm, 1 br, etc)
    @Column(name="unittype")
    private String unitType;

    //is utilities paid? included, avg cost?
    @Column(name="utilitiessituation")
    private String utilitiesSitutation;

    //owner info (first name, relation to university, title)
    @Column(name="ownername")
    private String ownerName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
