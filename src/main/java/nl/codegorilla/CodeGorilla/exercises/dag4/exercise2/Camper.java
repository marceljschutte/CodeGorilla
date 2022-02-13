package nl.codegorilla.CodeGorilla.exercises.dag4.exercise2;

public class Camper extends Vehicle {

    public Camper(String rentalCode) {
        super(rentalCode);
    }

    public String camp(String location) {
        return "Set up camp at" + location;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Camper";
    }
}
