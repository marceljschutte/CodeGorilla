package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1;


import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Vehicle;

import java.util.Comparator;
import java.util.Scanner;

public class IO {

    private Scanner scanner;

    public IO() {
        scanner = new Scanner(System.in);
    }

    public String askVehicleCode(String question) {
        System.out.println(question);
        if (scanner.hasNext()) {
            return scanner.next();
        } else {
            System.out.println("Incorrect input!");
        }
        return null;
    }

    public void printInventory(Inventory inventory) {
        inventory.getVehicles().stream().
                sorted(Comparator.comparing(Vehicle::getRentalCode)).
                forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}
