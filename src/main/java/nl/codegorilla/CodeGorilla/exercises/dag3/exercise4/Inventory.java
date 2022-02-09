package nl.codegorilla.CodeGorilla.exercises.dag3.exercise4;


import nl.codegorilla.CodeGorilla.exercises.dag3.exercise4.vehicle.Vehicle;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inventory {
    private Set<Vehicle> vehicles = new HashSet<>();

    public void add(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public Collection<Vehicle> getVehicles() {
        return Collections.unmodifiableCollection(vehicles);
    }

    public void rent(Vehicle vehicle) {
        if (vehicles.contains(vehicle)) {
            vehicle.rent();
            vehicles.remove(vehicle);
        } else {
            throw new IllegalStateException("Can not rent vehicle " + vehicle);
        }
    }

    public Vehicle findVehicle(String vehicleCode) {
        return vehicles.stream().
                filter(vehicle -> vehicleCode.equals(vehicle.getRentalCode())).
                findFirst().
                orElseThrow(() -> new IllegalStateException("Vehicle with code " + vehicleCode + " not found"));
    }
}
