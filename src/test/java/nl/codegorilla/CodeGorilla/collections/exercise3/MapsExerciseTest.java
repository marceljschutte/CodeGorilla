package nl.codegorilla.CodeGorilla.collections.exercise3;

import nl.codegorilla.CodeGorilla.exercises.dag6.exercise3.MapsExercise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapsExerciseTest {

    @Test
    void histogram() {
        List<String> input = Arrays.asList("Penguin", "Penguin", "Bear", "Lion", "Penguin", "Tiger", "Penguin", "Lion");
        Map<String, Integer> result = new MapsExercise().histogram(input);
        Map<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("Penguin", 4);
        expectedResult.put("Bear", 1);
        expectedResult.put("Lion", 2);
        expectedResult.put("Tiger", 1);
        Assertions.assertEquals(expectedResult, result);
    }
}