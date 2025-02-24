package ru.kory.runo.coderun.java_tasks.medium;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TheMostCheapestWay_2 {

    /*
    5 5

    1 1 1 1 1
    3 100 100 100 100
    1 1 1 1 1
    2 2 2 2 1
    1 1 1 1 1
     */

    public static void main(String... args) throws IOException {
        String input = """
                5 5
                1 1 1 1 1
                3 100 100 100 100
                1 1 1 1 1
                2 2 2 2 1
                1 1 1 1 1
                """;

        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        getResult();
    }

    public static void getResult() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        // Чтение первой строки. Размер матрицы
        String[] parts = reader.readLine().split(" ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        // Чтение последующих строк со значениями матрицы
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] lineParts = reader.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(lineParts[j]);
            }
        }

        // Логика



        // Просмотр матрицы и её содержимого
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result.append(matrix[i][j]).append(" ");
//            }
//            result.append("\n");
//        }
//        System.out.println(result);


    }

}
