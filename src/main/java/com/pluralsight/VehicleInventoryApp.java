package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleInventoryApp {

    public static void main(String[] args) {
        Scanner carscanner = new Scanner(System.in);

       // Create an empty array list of vehicles objects
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        //create a vehicle , add it to the array

        Vehicle car1 = new Vehicle(101121,"Ford explorer","red", 4500,13500);
        // add that object to the array
        Vehicle.add(car1);

        // add another vehicle to you arrays

        Vehicle car2 = new Vehicle(101122,"Toyota Camry","Blue",60000,11000);
        Vehicle.add(car2);

        Vehicle car3 = new Vehicle(101123,"Chevrolet Malibu","Black",50000,9700);
        Vehicle.add(car3);

        Vehicle car4 = new Vehicle(101124,"Honda Civic","White",70000,7500);
        Vehicle.add(car4);

        Vehicle car5 = new Vehicle(101125,"Subaru Outback","Green",55000,14500
        );
        Vehicle.add(car5);

        Vehicle car6 = new Vehicle(101126,"Jeep Wrangler","Yellow",30000,16000);
        Vehicle.add(car6);




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


        String userInput = carscanner.nextLine();

        switch (userInput) {
            case "1" -> {
                // Print a list of all the vehicles
                System.out.println("List all vehicles");
                String listAllVehicles = carscanner.nextLine();

                for (Vehicle currentVehicle : vehicles) {
                    currentVehicle.display();
                }
            }
            case "2" -> {
                System.out.println("Search by make and model");
                String searchMakeModel = carscanner.nextLine();

            }
            case "3" -> {
                System.out.println("Enter minimum search price  range");
                String priceMinimumText = myscanner.nextLine();
               double priceMinimum = Double.parseDouble((priceMinimumText);

               System.out.println("Enter maximum search price range");
               String priceMaximumText = myScanner.nextLine();
               double priceMaximum = Double.parseDouble(priceMaximum);



            }
            case "4" -> {
                System.out.println("Enter the color you want");
                String seachColor = carscanner.nextLine();

            }
            case "5" -> {
                System.out.println("add a vehicle");
                String addVehicle = carscanner.nextLine();

            }
            case "6" -> {
                System.out.println("Bye!");
            }

        }

    }

}


