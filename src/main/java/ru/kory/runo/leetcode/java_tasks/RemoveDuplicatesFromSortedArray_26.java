package ru.kory.runo.leetcode.java_tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class RemoveDuplicatesFromSortedArray_26 {

    public static int removeDuplicates(int[] nums) {
        List<Integer> numsWithoutDuplicates = new ArrayList<>();

        for (int n : nums) {
            if (!numsWithoutDuplicates.contains(n)) {
                numsWithoutDuplicates.add(n);
            }
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(numsWithoutDuplicates);
        int index = 0;
        while (!q.isEmpty()) {
            nums[index] = q.poll();
            index++;
        }

        System.out.println(numsWithoutDuplicates);
        return numsWithoutDuplicates.size();
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}
