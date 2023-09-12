package javavariables;

/**
 * Application: JavaVariables 
 * Version: 1.0
 * Author: Daniel Barbu
 * Student Id: 20024094
 * Module: Object Oriented Programming
 * @author 20024094
 */

public class JavaVariables {

    public static void main(String[] args) {
        String manufacturer = "Mercedes";
        String model = "Benz";
        String operator = "Taxi Inverness";
        int yearOfManufacture = 2010;
        int maxCapacity = 4;
        int engines = 1;
        float priceCar = 30000.4f;
        char status = 'A';
        
        System.out.println("Car: " + manufacturer + " " + model);
        System.out.println("---------------------------------");
        System.out.println("Operator: " + operator);
        System.out.println("Production Year: " + yearOfManufacture);
        System.out.println("Max Capacity: " + maxCapacity);
        System.out.println("Engines: " + engines);
        System.out.println("Car Price in Euro: " + priceCar);
        System.out.println("Status: " + status);
    }
    
}