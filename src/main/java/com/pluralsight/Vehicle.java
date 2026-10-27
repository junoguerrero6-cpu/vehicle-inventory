package com.pluralsight;

public class Vehicle {

    private String makeModel ;
    private long vehicleId ;
    private  String color ;
    private  int odometerReading;
    private  double price ;

    public Vehicle(long vehicleId, String makeModel,
                   String color, int odometerReading,
                   double price) {

        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
}

    public static void add(Vehicle car) {

    }

    public String getMakemodel() {
        return makeModel;
    }

    public void setMakemodel(String makeodel) {
        this.makeModel = makeodel;
    }
// color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
// vehicle id

    public long getVehicleid() {
        return vehicleId;
    }

    public void setVehicleid(long vehicleid) {
        this.vehicleId = vehicleid;
    }
//Odometer reading

    public int getOdometerreading() {
        return odometerReading;
    }

    public void setOdometerreading(int odometerreading) {
        this.odometerReading = odometerreading;
    }
// price

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("VIN: %s, Make/Model: %s");
    }



}
