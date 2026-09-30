// 7 . write a program to check a num is palindrome

package PracticeQuestions;

public class Palindrome {
    public static void main(String[] args) {
        int num = 5349435;
        int reverse = reverseNumber(num);
        System.out.println(reverse);
        if (num == reverse) {
            System.out.println("palindrome");
        }
    }

    public static boolean isPalindrome(int number) {
        return number >= 0 && number == reverseNumber(number);
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
}
