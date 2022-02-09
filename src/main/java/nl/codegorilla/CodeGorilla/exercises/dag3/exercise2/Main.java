package nl.codegorilla.CodeGorilla.exercises.dag3.exercise2;

public class Main {
    public static void main(String[] args) { new Main().startExercise(); }

    public void startExercise() {

        Calculation cal1 = new Calculation(1, "+", 2);
        Calculation cal2 = new Calculation(1, "+", 2);

        Calculation cal3 = new Calculation(8, "-", 2);
        Calculation cal4 = new Calculation(3, "+", 3);

        if (cal1.equals(cal2)) {
            System.out.println("Equals for cal1 and cal2: OK");
        } else {
            System.out.println("Equals for cal1 and cal2: NOK");
        }

        if (cal3.equals(cal4)) {
            System.out.println("Equals for cal3 and cal4: OK");
        } else {
            System.out.println("Equals for cal3 and cal4: NOK");
        }
    }
}
