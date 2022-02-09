package nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle;

public class Car extends Vehicle {
    @Override
    void drive() {
        startCar();
        System.out.println("Driving the car");
    }

    // TODO If we want this method to be only accessible from the drive method, what access modifier makes the most sense here?
    public void startCar() {
        System.out.println("Starting the car");
    }

    @Override
    String getType() {
        return "car";
    }

    @Override
    int getNumberOfWheels() {
        return 4;
    }
}
