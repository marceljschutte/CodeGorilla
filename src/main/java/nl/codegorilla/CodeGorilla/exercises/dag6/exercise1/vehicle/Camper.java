package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle;

public class Camper extends Vehicle {
    public Camper(String rentalCode) {
        super(rentalCode);
    }

    @Override
    public void drive() {
        System.out.println("Driving in camper " + getRentalCode());
    }
}
