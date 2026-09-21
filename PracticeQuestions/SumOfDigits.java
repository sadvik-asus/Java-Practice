// 3 . write a javaprogram to find sum of digits

package PracticeQuestions;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 539;
        int sum = 0;
        System.out.println("Number : "+num);
        while(num>0){
            int digit = num % 10;
            num = num / 10;
            sum += digit;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}
