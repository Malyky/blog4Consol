package com.example.cameldemo.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Conzert {

    @XmlElement
    private int id;

    @XmlElement
    private String city;

    @XmlElement
    private String artist;

    @XmlElement
    private Stadion stadion;

    private Boolean isValidated;


    public Conzert(int id, String city, String artist, Stadion stadion) {
        this.id = id;
        this.city = city;
        this.artist = artist;
        this.stadion = stadion;
    }

    public Conzert() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Stadion getStadion() {
        return stadion;
    }

    public void setStadion(Stadion stadion) {
        this.stadion = stadion;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Boolean getValidated() {
        return isValidated;
    }

    public void setValidated(Boolean validated) {
        isValidated = validated;
    }

    @Override
    public String toString() {
        return "Konzert{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", artist='" + artist + '\'' +
                ", stadion=" + stadion +
                ", isValidated=" + isValidated +
                '}';
    }
}