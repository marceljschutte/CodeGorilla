package nl.codegorilla.CodeGorilla.exercises.dag3.exercise3.vehicle;

public abstract class Vehicle {

    // TODO Give drive an access modifier that allows it to be called from the main. See what extra changes you need.
    abstract void drive();


    // TODO getType and getNumberOfWheels now have package access. This works because Bike and Car are in the same package.
    // Choose another access modifier that allows us to do both of these:
    // - Move Bike and/or Car to another package
    // - Calling it directly from the Main should still not be allowed.

    abstract String getType();

    abstract int getNumberOfWheels();

    @Override
    public String toString() {
        return "This vehicle is a " + getType() + " and has " + getNumberOfWheels() + " wheels";
    }
}
