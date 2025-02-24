package ru.kory.runo.leetcode_java;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Example 1:
Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.

Example 2:
Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */
public class SortThePeople {

    public static String[] sortPeople(String[] names, int[] heights) {
        return IntStream.range(0, names.length)
                .boxed() // Преобразует IntStream в Stream<Integer>
                .sorted((i, j) -> Integer.compare(heights[j], heights[i])) // Сортирует индексы по высоте в обратном порядке
                .map(i -> names[i]) // Преобразует отсортированные индексы в имена
                .toArray(String[]::new); // Преобразует Stream<String> в массив String[]
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }

}