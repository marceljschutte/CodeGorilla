package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public void rent(int amountToAdd, ChronoUnit unit) {
        System.out.println("Renting vehicle " + rentalCode + " for " + amountToAdd + " " + unit.toString());
        dueBack(amountToAdd, unit);
    }

    public String getRentalCode() {
        return rentalCode;
    }

    public void dueBack(int amountToAdd, ChronoUnit unit) {
        // TODO show the correct date
        System.out.println("Due back on: " + LocalDate.now());
    }

    @Override
    public String toString() {
        return "Vehicle{" + "rentalCode='" + rentalCode + "'}";
    }
}
