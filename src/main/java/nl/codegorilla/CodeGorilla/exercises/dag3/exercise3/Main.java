package nl.codegorilla.CodeGorilla.exercises.dag3.exercise3;

import nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle.Vehicle;

public class Main {

    public static void main(String[] args)
    {
        new Main().startExcersie3();
    }

    private void startExcersie3() {
        Inventory inventory = new Inventory();
        for (Vehicle vehicle : inventory.getVehicles()) {
            System.out.println(vehicle);
            // TODO We want to call vehicle.drive() here, but we can not do that. Why not and what do we need to change?
        }
    }

}
