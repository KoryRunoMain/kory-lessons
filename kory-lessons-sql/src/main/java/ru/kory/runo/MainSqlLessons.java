package ru.kory.runo;

import ru.kory.runo.solutions.SqlQueryLeetCodeTasksImpl;

import java.util.Scanner;

public class MainSqlLessons {
    public static void main(String[] args) {
        SqlQueryLeetCodeTasksImpl tasks = new SqlQueryLeetCodeTasksImpl();

        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("\nДля поиска нужно ввести номер задачи, для выхода ввести 'q'");

        while (true) {
            System.out.println("\nВведите номер задачи ниже:");
            input = scanner.next();

            if ("q".equalsIgnoreCase(input)) {
                break;
            }

            System.out.println(tasks.getSqlQuerySolution(input));
        }
        scanner.close();
    }
}
