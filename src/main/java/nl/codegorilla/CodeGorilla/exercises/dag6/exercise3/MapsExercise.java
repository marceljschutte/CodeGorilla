package nl.codegorilla.CodeGorilla.exercises.dag6.exercise3;

import java.util.*;

public class MapsExercise {

    // This method is supposed to calculate the number of times a certain value occurs in the input list.
    // For example the input [ "Pinguin", "Tiger", "Tiger", "Pinguin", "Lion" ]
    // Should return a map with the following key/value pairs:
    //   Pinguin: 2
    //   Tiger: 2
    //   Lion: 1
    public Map<String, Integer> histogram(List<String> inputList)
    {
        Map<String, Integer> resultMap = new HashMap<>();

        // First we initialize the map, by associating the value 0 to each unique input element
        for (String inputValue : new HashSet<>(inputList)) {
            resultMap.put(inputValue, 0);
        }

        // Second, we consider each element of the input and increment the appropriate value in the resultMap
        for (String inputValue : inputList) {
            // TODO Update resultMap here, based on inputValue
        }

        return resultMap;
    }
}
