package com.company;

public abstract class Rehoming {

    private String rehomingPlace;
    private String rehomingAddress;

    public String getRehomingPlace() {
        return rehomingPlace;
    }

    public void setRehomingPlace(String rehomingPlace) {
        this.rehomingPlace = rehomingPlace;
    }

    public String getRehomingAddress() {
        return rehomingAddress;
    }

    public void setRehomingAddress(String rehomingAddress) {
        this.rehomingAddress = rehomingAddress;
    }

    protected Rehoming (String rehomingPlace, String rehomingAddress){
        this.rehomingPlace = rehomingPlace;
        this.rehomingAddress = rehomingAddress;
    }
}
