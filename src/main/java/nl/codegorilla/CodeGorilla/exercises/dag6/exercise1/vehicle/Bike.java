package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle;

public class Bike extends Vehicle {
    public Bike(String rentalCode) {
        super(rentalCode);
    }

    @Override
    public void drive() {
        System.out.println("Riding bike " + getRentalCode());
    }
}
