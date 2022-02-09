package nl.codegorilla.CodeGorilla.exercises.dag3.exercise3;



import nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle.Bike;
import nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle.Car;
import nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Vehicle> vehicles = new ArrayList<>();

    public Inventory()
    {
        vehicles.add(new Car());
        vehicles.add(new Bike());
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
