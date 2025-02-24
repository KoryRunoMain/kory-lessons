package ru.kory.runo.coderun.java_tasks.easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class CollectionOfSymbols_251 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = reader.readLine();
        String c = reader.readLine();
        reader.close();

        int result = findMinSubstring(s, c);
        writer.write(String.valueOf(result));
        writer.close();
    }

    public static int findMinSubstring(String s, String c) {
        Set<Character> setC = new HashSet<>();
        for (char character : c.toCharArray()) {
            setC.add(character);
        }

        Set<Character> setS = new HashSet<>();
        for (char character : s.toCharArray()) {
            setS.add(character);
        }

        // Если в строке s не содержатся все символы из c
        if (!setS.containsAll(setC)) {
            return 0;
        }

        int minLength = getMinLength(s, setC);

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    private static int getMinLength(String s, Set<Character> setC) {
        int minLength = Integer.MAX_VALUE;
        int n = s.length();

        // Перебираем все возможные подстроки строки s
        for (int i = 0; i < n; i++) {
            Set<Character> currentSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                currentSet.add(s.charAt(j));

                // Проверка: совпадают ли множества текущей подстроки и множества c
                if (currentSet.equals(setC)) {
                    int currentLength = j - i + 1;
                    minLength = Math.min(minLength, currentLength);
                    break;  // Как только нашли подстроку, двигаемся к следующему i
                }
            }
        }
        return minLength;
    }

}
