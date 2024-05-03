package Ola_LLD;

public class Trip {
    Rider rider;
    Driver driver;
    String sourceLoc, destinationLoc;
    boolean tripStatus;
    int tripId;
    double price;
    PricingStrategy pricingStrategy;
    DriverMatchingStrategy driverMatchingStrategy;

    Trip(Rider rider, Driver driver, String sourceLoc, String destinationLoc, double price, PricingStrategy pricingStrategy, DriverMatchingStrategy driverMatchingStrategy){
        this.rider = rider;
        this.driver = driver;
        this.sourceLoc = sourceLoc;
        this.destinationLoc = destinationLoc;
        this.price = price;
        this.pricingStrategy = pricingStrategy;
        this.driverMatchingStrategy = driverMatchingStrategy;
    }

    public int getTripId(){return tripId;}

    void displayTripDetails(){
        System.out.println("Rider: " + rider.getName());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Source Loc: " + this.sourceLoc + " Destination Loc: " + this.destinationLoc);
        System.out.println("Trip Status: " + tripStatus);
        System.out.println("Trip ID: " + tripId);
        System.out.println("Price: " + this.price);
    }


}
