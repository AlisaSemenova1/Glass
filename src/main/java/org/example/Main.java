package org.example;

public class Main {
    public static void main(String[] args) {
        final int glassVolumeMl = 650;
        final double waterPercent = 33;
        final double waterMl = (glassVolumeMl * waterPercent) /100;
        System.out.println("переменная glassVolumeMl: " + glassVolumeMl);
        System.out.println("переменная waterPercent: " + waterPercent);
        System.out.println("переменная waterMl: " + waterMl);
    }
}