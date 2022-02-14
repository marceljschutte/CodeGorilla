package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

import java.util.List;
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

    public void printInventory(List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }
    }
}
