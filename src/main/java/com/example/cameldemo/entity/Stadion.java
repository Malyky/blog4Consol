package com.example.cameldemo.entity;

public class Stadion {

    private String name;

    private int seatCount;

    private boolean isCovered;

    public Stadion(String name, int seatCount, boolean isCovered) {
        this.name = name;
        this.seatCount = seatCount;
        this.isCovered = isCovered;
    }

    public Stadion() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public void setCovered(boolean covered) {
        this.isCovered = covered;
    }

    @Override
    public String toString() {
        return "Stadion{" +
                "name='" + name + '\'' +
                ", seatCount=" + seatCount +
                ", isCovered=" + isCovered +
                '}';
    }
}
