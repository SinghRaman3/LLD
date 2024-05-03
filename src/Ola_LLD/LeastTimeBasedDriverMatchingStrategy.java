package Ola_LLD;

public class LeastTimeBasedDriverMatchingStrategy implements DriverMatchingStrategy {
    public Driver matchDriver(Trip tripData) {
        return tripData.driver;
    }
}
