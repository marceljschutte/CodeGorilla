package nl.codegorilla.CodeGorilla.exercises.dag3.exercise4;


import nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle.Bike;
import nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle.Camper;
import nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle.Car;
import nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise2();
    }

    private void startExercise2() {
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
            inventory.rent(vehicle);
            vehicle.drive();
            // TODO Overload the drive method to accept a duration, e.g. "Driving in vehicle V82163 for 60 minutes".
            // vehicle.drive(60);

            System.out.println();
        }
    }

}
