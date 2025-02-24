package ru.kory.runo.coderun_java.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueElement_155 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(reader.readLine());

        String[] parts = reader.readLine().split(" ");
        int[] nums = Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .toArray();

        Map<Integer, Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()));

        long countUnique = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .count();

        writer.write(String.valueOf(countUnique));
        writer.newLine();

        reader.close();
        writer.close();
    }

}