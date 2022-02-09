package nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle;

public class Vehicle {

    private String rentalCode;

    public Vehicle(String rentalCode) {
        this.rentalCode = rentalCode;
    }

    public void rent() {
        System.out.println("Renting vehicle " + rentalCode);
    }

    public void drive() {
        System.out.println("Driving in vehicle " + rentalCode);
    }

    public String getRentalCode() {
        return rentalCode;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "rentalCode='" + rentalCode + "'}";
    }
}
