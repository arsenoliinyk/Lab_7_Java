package com.company;

public class Main {

    public static void main(String[] args) {
        Printer canon = new Printer();
        Printer apple = new Printer("Ukraine", 10, "apple", 3);
        Printer samsung = new Printer("Samsung", 40, 4000, "Ukraine", 40, "Samsung", 3, 5, "Black", "bluetooth");

        System.out.println(canon.toString());
        System.out.println(apple.toString());
        System.out.println(samsung.toString());
        System.out.println("---------------------------------------------");

        Printer.setYearOfManufacture(1960);

        canon.printStaticYearOfManufacture();
        canon.printYearOfManufacture();
        
    }
}
