// 2 . write a program to count the number of digits in a number

package PracticeQuestions;

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 539;
        System.out.println("No.of Digits : " + countDigits(num));
    }

    public static int countDigits(int number) {
        long value = Math.abs((long) number);
        if (value == 0) {
            return 1;
        }

        int count = 0;
        while (value > 0) {
            value /= 10;
            count++;
        }
        return count;
    }
}
