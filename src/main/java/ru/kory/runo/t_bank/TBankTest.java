package ru.kory.runo.t_bank;

//import java.util.Scanner;
//
//public class TBankTest {
//    public static void main(String[] args) {
//        System.out.println("Input a number for gauseSum:");
//        Scanner scanner = new Scanner(System.in);
//        long inputNumber = scanner.nextLong();
//        int constNumber = 100;
//        long result = ((inputNumber - constNumber + 1) * (constNumber + inputNumber) / 2);
//        System.out.println(result);
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class TBankTest {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int inputNumber = scanner.nextInt();
//        int result;
//
//        if (inputNumber == 1) {
//            result = 1;
//        } else {
//            result = 4 * (inputNumber - 1);
//        }
//        System.out.println(result);
//        scanner.close();
//    }
//}


//import java.util.Scanner;
//
//public class TBankTest {
//    public static void main(String[] args) {
//        int pairsCount = 0;
//        Scanner scanner = new Scanner(System.in);
//        int inputNum = scanner.nextInt();
//        int[][] matrix = new int[inputNum][inputNum];
//        int[] rowSum = new int[inputNum];
//        int[] columnSum = new int[inputNum];
//
//        for (int row = 0; row < inputNum; row++) {
//            for (int col = 0; col < inputNum; col++) {
//                matrix[row][col] = scanner.nextInt();
//                rowSum[row] += matrix[row][col];
//                columnSum[col] += matrix[row][col];
//            }
//        }
//
//        for (int row = 0; row < inputNum; row++) {
//            for (int col = 0; col < inputNum; col++) {
//                int rowSums = rowSum[row];
//                int colSums = columnSum[col];
//                int cellSums = matrix[row][col];
//                if (Math.abs(rowSums - colSums) <= cellSums) {
//                   pairsCount++;
//                }
//            }
//        }
//
//        System.out.println(pairsCount);
//    }
//
//}

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.List;

public class TBankTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();

        List<Integer>[] dependencies = new List[inputNum + 1];
        for (int row = 1; row <= inputNum; row++) {
            dependencies[row] = new ArrayList<>();
        }

        int[] inDegree = new int[inputNum + 1];
        for (int row = 1; row <= inputNum; row++) {
            int inputN = scanner.nextInt();
            for (int col = 0; col < inputN; col++) {
                int dep = scanner.nextInt();
                dependencies[dep].add(row);
                inDegree[row]++;
            }
        }

        if (inputNum == 1) {
            System.out.println(1);
            return;
        }

        int[] compileTime = new int[inputNum + 1];
        Queue<Integer> queue = new LinkedList<>();

        for (int row = 1; row <= inputNum; row++) {
            if (inDegree[row] == 0) {
                queue.add(row);
                compileTime[row] = 1;  // Processes with no dependencies start at time 1
            }
        }

        while (!queue.isEmpty()) {
            int process = queue.poll();
            for (int dependent : dependencies[process]) {
                compileTime[dependent] = Math.max(compileTime[dependent], compileTime[process] + 1);
                inDegree[dependent]--;
                if (inDegree[dependent] == 0) {
                    queue.add(dependent);
                }
            }
        }

        System.out.println(compileTime[1]);
    }

}


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class TBankTest {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int inputNum = scanner.nextInt();
//
//        List<Integer>[] dependencies = new List[inputNum + 1];
//        for (int row = 1; row <= inputNum; row++) {
//            dependencies[row] = new ArrayList<>();
//        }
//
//        int[] inDegree = new int[inputNum + 1];
//
//        for (int row = 1; row <= inputNum; row++) {
//            int inputN = scanner.nextInt();
//            for (int col = 0; col < inputN; col++) {
//                int dep = scanner.nextInt();
//                dependencies[dep].add(row);
//                inDegree[row]++;
//            }
//        }
//
//        Queue<Integer> queue = new LinkedList<>();
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> currentLvl = new ArrayList<>();
//
//        for (int row = 1; row <= inputNum; row++) {
//            if (inDegree[row] == 0) {
//                queue.add(row);
//            }
//        }
//
//        while (!queue.isEmpty()) {
//            currentLvl.clear();
//            int queueSize = queue.size();
//            for (int row = 0; row < queueSize; row++) {
//                int process = queue.poll();
//                currentLvl.add(process);
//
//                for (int dependent : dependencies[process]) {
//                    inDegree[dependent]--;
//                    if (inDegree[dependent] == 0) {
//                        queue.add(dependent);
//                    }
//                }
//            }
//
//            Collections.sort(currentLvl);
//            List<Integer> resultList = new ArrayList<>(currentLvl);
//            result.add(resultList);
//        }
//
//        System.out.println(result.size());
//        for (List<Integer> level : result) {
//            System.out.print(level.size() + " ");
//            for (int process : level) {
//                System.out.print(process + " ");
//            }
//            System.out.println();
//        }
//    }
//
//}
