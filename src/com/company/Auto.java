package com.company;

public class Auto <T> implements Printable {
    private String name;
    T volume;
    T year;

    public Auto(String name, T volume, T year) {
        this.name = name;
        this.volume = volume;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public T getVolume() {
        return volume;
    }

    public T getYear() {
        return year;
    }

    @Override
    public T volume() {
        return volume;
    }

    @Override
    public T year() {
        return year;
    }
}
