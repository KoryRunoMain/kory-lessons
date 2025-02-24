package ru.kory.runo.tasks;

/*
Создайте список строк List<String> names, содержащий имена.
Используя лямбда-выражение, отсортируйте этот список по длине строк.
Затем с помощью другого лямбда-выражения выведите все имена, начинающиеся с буквы "А".
 */

import java.util.Arrays;
import java.util.List;

public class LambdaTask {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Anton", "Bashka", "Andrey", "Anna", "Misha");

        names.sort((s1, s2) -> s1.length() - s2.length());
        names.forEach(System.out::println);
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }

}
