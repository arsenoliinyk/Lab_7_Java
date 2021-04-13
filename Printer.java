package com.company;

public class Printer {
    private String name;
    private int pace;
    private int price;

    private String country;
    private int size;
    private String brand;
    private int guarantee;
    private int weight;

    private static int yearOfManufacture;
    protected String color;
    protected String connectionType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(int guarantee) {
        this.guarantee = guarantee;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public static void setYearOfManufacture(int yearOfManufacture) {
        Printer.yearOfManufacture = yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public Printer() { }


    public Printer(String country, int size, String brand, int guarantee) {
        this.country = country;
        this.size = size;
        this.brand = brand;
        this.guarantee = guarantee;
    }

    public Printer(String name, int pace, int price, String country, int size, String brand, int guarantee, int weight, String color, String connectionType) {
        this.name = name;
        this.pace = pace;
        this.price = price;
        this.country = country;
        this.size = size;
        this.brand = brand;
        this.guarantee = guarantee;
        this.weight = weight;
        this.color = color;
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Printer:\n" +
                "   name = " + name +
                ", pace = " + pace + " p/m" +
                ", price = " + price +" $"+
                ", country = " + country +
                ", size = " + size +" litres"+
                ", brand = " + brand +
                ", guarantee = " + guarantee+" years" +
                ", weight = " + weight +" kg"+
                ", color = " + color +
                ", connectionType = " + connectionType;
    }

    public void printStaticYearOfManufacture(){
        System.out.println(yearOfManufacture);
    }

    public void printYearOfManufacture(){
        System.out.println(yearOfManufacture);
    }

    public void resetValues(String name, int pace, int price, String country, int size, String brand, int guarantee, int weight, String color, String connectionType) {
        this.name = name;
        this.pace = pace;
        this.price = price;
        this.country = country;
        this.size = size;
        this.brand = brand;
        this.guarantee = guarantee;
        this.weight = weight;
        this.color = color;
        this.connectionType = connectionType;
    }

}
