package nl.codegorilla.CodeGorilla.collections.exercise2;

import nl.codegorilla.CodeGorilla.exercises.dag6.exercise2.CollectionExercises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;

class CollectionExercisesTest {

    @Test
    void sum() {
        List<Integer> input = Arrays.asList(1, null, 2, 3);
        int result = new CollectionExercises().sum(input);
        Assertions.assertEquals(6, result);
    }

    @Test
    void evenNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 5, 8, 37, 42, -1, -2);
        List<Integer> result = new CollectionExercises().evenNumbers(input);
        Assertions.assertEquals(Arrays.asList(2, 8, 42, -2), result);
    }

    @Test
    void removeDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 3, 1, 3, 37, 42, 1);
        List<Integer> result = new CollectionExercises().removeDuplicates(input);
        List<Integer> resultSorted = new ArrayList<>(result);
        Collections.sort(resultSorted);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 37, 42), resultSorted);
    }

    @Test
    void reverseList() {
        List<String> input = Arrays.asList("Oscar", "Max", "Tiger", "Sam");
        List<String> result = new CollectionExercises().reverseList(input);
        Assertions.assertEquals(Arrays.asList("Sam", "Tiger", "Max", "Oscar"), result);
    }

    @Test
    void countToN() {
        List<Integer> result = new CollectionExercises().countToN(10);
        Assertions.assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), result);
    }

    @Nested
    class ElementsUntilAndIncludingStop {
        @Test
        void testWithStop() {
            List<String> input = Arrays.asList("Parmesan", "Gruyere", "stop", "Burrata");
            List<String> result = new CollectionExercises().elementsUntilAndIncludingStop(input);
            Assertions.assertEquals(Arrays.asList("Parmesan", "Gruyere", "stop"), result);
        }

        @Test
        void testWithoutStop() {
            List<String> input = Arrays.asList("Parmesan", "Gruyere", "Burrata");
            List<String> result = new CollectionExercises().elementsUntilAndIncludingStop(input);
            Assertions.assertEquals(Arrays.asList("Parmesan", "Gruyere", "Burrata"), result);
        }
    }

    @Test
    void combinedElements() {
        Set<Integer> input1 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 4, 3, 6, 7)));
        Set<Integer> input2 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(3, 6, 2, 5)));
        Set<Integer> result = new CollectionExercises().combinedElements(input1, input2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void commonElements() {
        Set<Integer> input1 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 4, 3, 6, 7)));
        Set<Integer> input2 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(3, 6, 2, 5)));
        Set<Integer> result = new CollectionExercises().commonElements(input1, input2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(3, 6));
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void exclusiveElements() {
        Set<Integer> input1 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(1, 4, 3, 6, 7)));
        Set<Integer> input2 = Collections.unmodifiableSet(new HashSet<>(Arrays.asList(3, 6, 2, 5)));
        Set<Integer> result = new CollectionExercises().exclusiveElements(input1, input2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 4, 7, 2, 5));
        Assertions.assertEquals(expectedResult, result);
    }
}