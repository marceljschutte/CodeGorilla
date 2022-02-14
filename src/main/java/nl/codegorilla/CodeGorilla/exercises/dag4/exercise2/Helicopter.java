package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

import java.time.LocalDateTime;

public class Helicopter extends Vehicle {
    public String pilot;

    public Helicopter(String rentalCode, String pilot) {
        super(rentalCode);
        this.pilot = pilot;
    }

    public String fly() {
        return "Started flying at" + LocalDateTime.now();
    }

    public String getPilot() {
        return pilot;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Helicopter, Pilot: " + pilot;
    }
}
