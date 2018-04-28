package com.tareksaidee.newyorkgo.DTO;

import com.google.gson.annotations.SerializedName;

public class ArtGallery {
    @SerializedName("the_geom")
    private transient Geom the_geom;

    @SerializedName("name")
    private String name;

    @SerializedName("tel")
    private String tel;

    @SerializedName("url")
    private String url;

    @SerializedName("address1") //don't use
    private String address1;

    @SerializedName("address2")
    private String address2;

    @SerializedName("city")
    private String city;

    @SerializedName("zip")
    private double zipCode;

    public ArtGallery(Geom the_geom, String name, String tel, String url, String address1, String address2, String city, double zipCode) {
        this.the_geom = the_geom;
        this.name = name;
        this.tel = tel;
        this.url = url;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.zipCode = zipCode;
    }

    public Geom getThe_geom() {
        return the_geom;
    }

    public void setThe_geom(Geom the_geom) {
        this.the_geom = the_geom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getZipCode() {
        return zipCode;
    }

    public void setZipCode(double zipCode) {
        this.zipCode = zipCode;
    }
}
