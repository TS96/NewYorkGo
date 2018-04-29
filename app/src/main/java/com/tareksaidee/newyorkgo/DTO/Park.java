package com.tareksaidee.newyorkgo.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class Park extends Recreation{
    @SerializedName("Name")
    private String name;

    @SerializedName("Location")
    private String location;

    @SerializedName("Zip")
    private int zipCode;

    private Double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String getParkName() {
        return null;
    }

    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public String getAddress1() {
        return null;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getPropID() {
        return propID;
    }

    public void setPropID(int propID) {
        this.propID = propID;
    }

    public Park(String name, String location, int zipCode, int propID) {
        this.name = name;
        this.location = location;

        this.zipCode = zipCode;
        this.propID = propID;
    }

    @SerializedName("Prop_ID")
    private int propID;

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public static Comparator<Park> COMPARE_BY_DISTANCE = new Comparator<Park>() {
        public int compare(Park one, Park other) {
            return one.distance.compareTo(other.distance);
        }
    };
}
