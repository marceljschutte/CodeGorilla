package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.startExercise2();
    }

    private void startExercise2() {
        // Instantiate the support classes
        IO inputOutput = new IO();
        Inventory inventory = new Inventory();

        doWork(inputOutput, inventory);
    }

    private void doWork(IO inputOutput, Inventory inventory) {
        System.out.println("Currently available for rent: ");
        inputOutput.printInventory(inventory.getVehiclesForRent());
        String vehicleCode = inputOutput.askVehicleCode("Please enter the vehicleCode you want");
        Vehicle vehicle = inventory.rentVehicle(vehicleCode);
        System.out.println(vehicle.toString());
    }


}
