package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle;

public class Helicopter extends Vehicle {
    public Helicopter(String rentalCode) {
        super(rentalCode);
    }

    @Override
    public void drive() {
        System.out.println("Flying in helicopter " + getRentalCode());
    }
}
