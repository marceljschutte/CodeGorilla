package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {

    private List<Vehicle> vehiclesForRent;

    public Inventory() {
        fillListOfVehicles();
    }

    public void fillListOfVehicles() {
        vehiclesForRent = new ArrayList<>();
        vehiclesForRent.add(new Vehicle("CAMP_001"));
        vehiclesForRent.add(new Camper("CAMP_002"));
        vehiclesForRent.add(new Vehicle("HELI_001"));
        vehiclesForRent.add(new Helicopter("HELI_002", "Steve"));
    }

    public List<Vehicle> getVehiclesForRent() {
        return Collections.unmodifiableList(vehiclesForRent);
    }

    public Vehicle rentVehicle(String vehicleCode) {
        for (Vehicle vehicle : vehiclesForRent) {
            if (vehicle.getRentalCode().equals(vehicleCode)) {
                vehiclesForRent.remove(vehicle);
                return vehicle;
            }
        }
        return null;
    }
}
