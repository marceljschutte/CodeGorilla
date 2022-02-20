package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1;

import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Bike;
import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Camper;
import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Car;
import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Vehicle;

import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise3();
    }

    private void startExercise3() {
        // Instantiate the support classes
        IO inputOutput = new IO();
        Inventory inventory = new Inventory();
        fillInventory(inventory);

        doWork(inputOutput, inventory);
    }

    private void fillInventory(Inventory inventory) {
        inventory.add(new Bike("B100"));
        inventory.add(new Camper("CMP15"));
        inventory.add(new Car("C111"));
        inventory.add(new Vehicle("V82163"));
    }

    private void doWork(IO inputOutput, Inventory inventory) {
        while (!inventory.getVehicles().isEmpty()) {
            System.out.println("Currently available for rent:");
            inputOutput.printInventory(inventory);
            String vehicleCode = inputOutput.askVehicleCode("Please enter the vehicleCode you want");
            Vehicle vehicle = inventory.findVehicle(vehicleCode);
            inventory.rent(vehicle, 1, ChronoUnit.DAYS);
            vehicle.drive();

            System.out.println();
        }
    }

}
