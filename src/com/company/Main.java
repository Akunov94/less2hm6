package com.company;

public class Main {

    public static void main(String[] args) {
        Auto car1 = new Auto("Ауди", 2.5, 2015);
        Auto car2 = new Auto("Fit", 1.5, 2017);
        printInfo(car1);
        printInfo(car2);

    }

    public static <T extends Number> void printInfo(Auto<T> car1) {
        System.out.println("Модел " + car1.getName() + " двигатель " + car1.getVolume() + " год " + car1.getYear());
    }
}
