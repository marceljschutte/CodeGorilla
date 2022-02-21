package nl.codegorilla.CodeGorilla.exercises.dag6.exercise2;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionExercises {

    public int sum(List<Integer> list)
    {
        // TODO The code below calculates the sum of the integer in the list.
        // However, if the list contains a null value, it will fail to complete.
        // Modify the code below so that it does not crash, but instead counts a null as 0 (zero).
        // Only modify the code inside of the { and } of the for loop.
        int result = 0;

        for (Integer integer : list) {
            result = result + integer;
        }

        return result;
    }

    public List<Integer> evenNumbers(List<Integer> list)
    {
        // TODO Return a new list, that contains only the even number of list while maintaining the order.
        return Collections.emptyList();
    }

    public List<Integer> removeDuplicates(List<Integer> list)
    {
        // TODO Return a new list that contains the elements of the input list, but values that occur
        // multiple times in the input list should only be once in the output list.
        // For example: [1, 2, 3, 3, 1, 3] should have [1, 2, 3] as the result.
        // The order of the result does not matter.
        return Collections.emptyList();
    }

    public List<String> reverseList(List<String> list)
    {
        // TODO Place the elements of the input, list, in reverse order.
        // For example: [3, 2, 1] becomes [1, 2, 3]
        // Perform this task using a for loop.
        // (Note that this could be done with the Collections.reverse, but you are not supposed to use that)
        return Collections.emptyList();
    }

    public List<Integer> countToN(int n)
    {
        // TODO Write a method that returns a list with number 1 ... n
        // For example: if n = 3, then the method should return [1, 2, 3]
        return Collections.emptyList();
    }

    public List<String> elementsUntilAndIncludingStop(List<String> list)
    {
        // TODO Return the elements of the input list until the word "stop" occurs, where "stop" should be included in the result.
        // For example: if the input is [ "a", "b", "stop", "c", "d" ], the result should be ["a", "b", "stop"]
        // If no "stop" occurs, return the whole input list.
        // Hint: Using a while loop is probably the easiest way to do this.
        return Collections.emptyList();
    }

    public Set<Integer> combinedElements(Set<Integer> firstSet, Set<Integer> secondSet)
    {
        // TODO Return a set that contains integers that are at least in one of the set.
        // For example: if firstSet = { 1, 2, 4 ] and secondSet = { 2, 3, 4 } then the result is { 1, 2, 3, 4 }
        return Collections.emptySet();
    }

    public Set<Integer> commonElements(Set<Integer> firstSet, Set<Integer> secondSet)
    {
        // TODO Return a set that contains the integers that are in both sets.
        // For example: if firstSet = { 1, 2, 4 } and secondSet = { 2, 3, 4 } then the result is { 2, 4 }
        return Collections.emptySet();
    }

    public Set<Integer> exclusiveElements(Set<Integer> firstSet, Set<Integer> secondSet)
    {
        // TODO Return a set that contains the integers that are either in firstSet or secondSet but not both.
        // For example: if firstSet = { 1, 2, 4 } and secondSet = { 2, 3, 4 } then the result is { 1, 3 }
        return Collections.emptySet();
    }

}
