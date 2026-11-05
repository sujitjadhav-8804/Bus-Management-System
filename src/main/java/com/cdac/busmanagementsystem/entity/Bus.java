
package com.cdac.busmanagementsystem.entity;

import com.cdac.busmanagementsystem.enums.BusType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer busId;

    private String busName;

    private String source;

    private String destination;

    private String city;

    private double fare;

    @Enumerated(EnumType.STRING)
    private BusType busType;

    // Default Constructor
    public Bus() {

    }

    // Parameterized Constructor
    public Bus(Integer busId, String busName, String source,
               String destination, String city, double fare,
               BusType busType) {

        this.busId = busId;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.city = city;
        this.fare = fare;
        this.busType = busType;
    }

    // Getters and Setters
    public Integer getBusId() {
        return busId;
    }

    public void setBusId(Integer busId) {
        this.busId = busId;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }
}
