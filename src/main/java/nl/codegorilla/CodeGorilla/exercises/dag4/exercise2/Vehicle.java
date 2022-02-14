package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

public class Vehicle {

    private String rentalCode;

    public Vehicle(String rentalCode) {
        this.rentalCode = rentalCode;
    }

    public String getRentalCode() {
        return rentalCode;
    }

    @Override
    public String toString() {
        return this.rentalCode;
    }
}
