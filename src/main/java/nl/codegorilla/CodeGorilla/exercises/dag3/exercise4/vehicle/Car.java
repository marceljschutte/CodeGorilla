package nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle;

public class Car extends Vehicle {
    public Car(String rentalCode) {
        super(rentalCode);
    }

    @Override
    public void drive() {
        System.out.println("Driving in car " + getRentalCode());
    }
}
