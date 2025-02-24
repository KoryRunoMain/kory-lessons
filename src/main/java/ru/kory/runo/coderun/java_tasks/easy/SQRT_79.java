package ru.kory.runo.coderun.java_tasks.easy;

public class SQRT_79 {

    public static void main(String... args) {
        solve(4, 1, 5);  // Пример с аргументами a = 4, b = 1, c = 5
    }

    /**
     * Метод для решения уравнения √(a * x) + b = c с переданными значениями a, b, и c.
     *
     * @param a первое число (параметр перед x в подкоренном выражении)
     * @param b второе число
     * @param c третье число
     */
    public static void solve(int a, int b, int c) {

        if (c < b) {
            System.out.println("NO SOLUTION");
            return;
        }

        int rightSide = c - b;

        if (a == 0) {
            if (b == c) {
                System.out.println("MANY SOLUTIONS");
            } else {
                System.out.println("NO SOLUTION");
            }
        } else {
            int square = rightSide * rightSide;
            if (square % a == 0) {
                int x = square / a;
                System.out.println(x);
            } else {
                System.out.println("NO SOLUTION");
            }
        }

    }
}
