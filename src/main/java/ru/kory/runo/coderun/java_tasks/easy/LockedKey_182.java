package ru.kory.runo.coderun.java_tasks.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// TODO
public class LockedKey_182 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] parts = reader.readLine().split(" ");
        int[] nums = Arrays.stream(parts)
                .mapToInt(Integer::parseInt)
                .toArray();

        int p = nums[0]; // 6
        int q = nums[1]; // 15

//        for (int i = 0; i < q; i++) {
//            int k = p % ;
//        }

        reader.close();
        writer.close();
    }

}
