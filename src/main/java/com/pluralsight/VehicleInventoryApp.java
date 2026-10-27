package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInventoryApp {

    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

       // Create an empty array list of vehicles objects
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        //create a vehicle , add it to the array

        Vehicle car = new Vehicle(101121,"Ford explorer","red", 4500,13500);
        // add that object to the array
        Vehicle.add(car);

        // add another vehicle to you arrays

        Vehicle yourcar = new Vehicle(101122,"Toyota camry","blue", 60000,11000);
        Vehicle.add(car);

        // loop the array list of veicles called : vehicles
        for (Vehicle currentvehcile : vehicles){
            System.out.println(currentvehcile.getColor());
        }

        String menuPrompt = """
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:""";
        System.out.println(menuPrompt);

        String userInput = myScanner.nextLine();

        switch (userInput) {
            case "1" -> {
                // Print a list of all the vehicles
                for (Vehicle currentVehicle : vehicles) {
                    currentVehicle.display();
                }
            }
            case "2" -> {
//                searchVehicles();
            }


        }
    }

}
