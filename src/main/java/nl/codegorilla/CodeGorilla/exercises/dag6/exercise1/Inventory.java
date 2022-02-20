package nl.codegorilla.CodeGorilla.exercises.dag6.exercise1;


import nl.codegorilla.CodeGorilla.exercises.dag6.exercise1.vehicle.Vehicle;

import java.time.temporal.ChronoUnit;
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

    public void rent(Vehicle vehicle, int amountToAdd, ChronoUnit unit) {
        if (vehicles.contains(vehicle)) {
            vehicle.rent(amountToAdd, unit);
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
