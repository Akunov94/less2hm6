package com.company;

public class Auto <T> implements Printable {
    private String name;
    private double volume;
    T year;

    public Auto(String name, double volume, T year) {
        this.name = name;
        this.volume = volume;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    public T getYear() {
        return year;
    }

    @Override
    public Object engine() {
        return null;
    }

    @Override
    public Object year() {
        return null;
    }
}
