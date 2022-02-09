package nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle;

public class Bike extends Vehicle {
    @Override
    void drive() {
        System.out.println("Driving the bike");
    }

    @Override
    String getType() {
        return "bike";
    }

    @Override
    int getNumberOfWheels() {
        return 2;
    }
}
