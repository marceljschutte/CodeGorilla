package nl.codegorilla.CodeGorilla.exercises.dag3.exercise5;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student(1001, "Schutte", null, "MJ","Marcel", "9728 BM", 806, Arrays.asList("Wiskunde", "Informatica"), Collections.emptyMap());

        Student studentB = new Student();
        studentB.setStudentId(1001);
        studentB.setAchternaam("Schutte");
        studentB.setTussenvoegsel(null);
        studentB.setInitialen("MJ");
        studentB.setVoornaam("Marcel");
        studentB.setPostcode("9728 BM");
        studentB.setHuisnummer(806);
        studentB.setVakken(Arrays.asList("Wiskunde", "Informatica"));
        studentB.setResultaten(Collections.emptyMap());

        if(studentA.equals(studentB) && studentA.toString().equals(studentB.toString())){
            System.out.println(studentA);
            System.out.println(studentB);
            System.out.println("Als je dit leest, dan werkt alles naar behoren en is de opdracht succesvol afgerond");
        }
    }
}
