package ru.kory.runo.leetcode_java;

/*
 Example 1:
 Input: x = 121
 Output: true
 Explanation: 121 reads as 121 from left to right and from right to left.

 Example 2:
 Input: x = -121
 Output: false
 Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

 Example 3:
 Input: x = 10
 Output: false
 Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        int y = x;
        int reversed = 0;

        if (x < 0) {
            return false;
        }
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }
        return y == reversed;
    }


    public static void main(String[] args) {
        int[] x = {121, -121, 10};
        for (int i = 0; i <= x.length - 1; i++) {
            System.out.println(isPalindrome(x[i]));
        }
    }

}