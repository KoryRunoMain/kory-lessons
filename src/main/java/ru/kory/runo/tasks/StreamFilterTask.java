package ru.kory.runo.tasks;

/*
Дан список чисел List<Integer> numbers.
Используя потоки, отфильтруйте все четные числа,
затем умножьте каждое из них на 2 и соберите результат в новый список.
Напишите метод, который выполнит эту операцию и выведет результат на экран.
 */

import java.util.Arrays;
import java.util.List;

public class StreamFilterTask {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public void filter() {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * 2)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {

        StreamFilterTask streamFilter = new StreamFilterTask();
        streamFilter.filter();

    }

}
