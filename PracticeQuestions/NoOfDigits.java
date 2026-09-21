// 2 . write a program to count the number of digits in a number

package PracticeQuestions;

public class NoOfDigits {
    public static void main(String[] args) {
        int num = 539;
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            num = num / 10;
            //System.out.print(digit+" ");
            count++ ;
        }
        System.out.println("No.of Digits : "+count);
    }
}
