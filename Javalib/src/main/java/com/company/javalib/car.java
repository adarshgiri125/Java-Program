package com.company.javalib;


//child class
public class car extends vehicle {
    private int modelYear = 2023;
    private String color = "Red";

    //Constructor
    public car(String color, int modelYear){
        this.color = color;
        this.modelYear = modelYear;
    }

    //Geter
    public int getModelYear(){
        return modelYear;
    }
    // to get direct getter setter click cmd + n;
    public String getColor() {
        return color;
    }

    //Setter
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final double pi = 3.14; // the value cant be change outside

    public void drive(){
        System.out.println("Drving");
    }

    static void sayHello(){
        System.out.println("Hello");
    } // this will help us like that we don't have to create object in the proram to acess

}
