package com.company;

public class Main {

    public static void main(String[] args) {
        Printer canon = new Printer();
        Printer apple = new Printer("Ukraine", 10, "apple", 3);
        Printer samsung = new Printer("Samsung", 40, 4000, "Ukraine", 40, "Samsung",
                             3, 5, "Black", "bluetooth");

        System.out.println(canon.toString());
        System.out.println(apple.toString());
        System.out.println(samsung.toString());
        System.out.println("---------------------------------------------");

        apple.resetValues("Apple", 70, 6000, "USA", 70, "Apple", 7,
                    15, "White", "type-c");

        System.out.println(apple.toString());

        Printer.printStaticYearOfManufacture();
        canon.printYearOfManufacture();

    }
}
