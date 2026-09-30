// 3 . write a javaprogram to find sum of digits

package PracticeQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 539;
        System.out.println("Number : "+num);
        System.out.println("Sum of Digits : " + sumDigits(num));
    }

    public static int sumDigits(int number) {
        long value = Math.abs((long) number);
        int sum = 0;
        while (value > 0) {
            sum += (int) (value % 10);
            value /= 10;
        }
        return sum;
    }
}
