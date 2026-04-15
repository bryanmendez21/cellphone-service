package com.pluralsight;

public class CellPhone {
    // Attributes
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Constructor (this is where user input is received)
    public CellPhone(int serialNumber,String model,String carrier,String phoneNumber,String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    // Getters (sends to print when called for)
    public int getSerialNumber() {
        return this.serialNumber;
    }
    public String getModel() {
        return this.model;
    }
    public String getCarrier() {
        return this.carrier;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getOwner() {
        return this.owner;
    }
}
