package ru.kory.runo.coderun.java_tasks.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class MiddleElement_1 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] nums = reader.readLine().split(" ");
        int [] sortedNums = Arrays.stream(nums)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        writer.write(String.valueOf(sortedNums[1]));

        reader.close();
        writer.close();
    }

}
