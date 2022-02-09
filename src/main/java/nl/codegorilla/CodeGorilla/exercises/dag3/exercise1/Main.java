package nl.codegorilla.CodeGorilla.exercises.dag3.exercise1;

public class Main {
    public static void main(String[] args) {
        new Main().startExercise();
    }

    private void startExercise() {
        Dog a = new Dog();
        a.name = "Apollo";
        a.age = 1;
        a.color = "Brown";

        Dog b = new Dog();
        b.name = "Ace";
        b.age = 2;
        b.color = "Black";

        Dog c = b;  // TODO c refers to the same Dog as b. If you perform an operation on c, what will happen to b? Can you prevent this?

        // TODO Increment the age of Dog a by using a new method that you write in the Dog class.

        // TODO Change the color of Dog b to the same as Dog a by using a new method that you write in the Dog class.

        printDogInformation("a", a);
        printDogInformation("b", b);
        printDogInformation("c", c);
    }

    private void printDogInformation(String variableName, Dog dog) {
        System.out.println("Dog " + variableName);
        System.out.println(" Name " + dog.name);
        System.out.println(" Age " + dog.age);
        System.out.println(" Color " + dog.color);
        System.out.println();
    }
}
