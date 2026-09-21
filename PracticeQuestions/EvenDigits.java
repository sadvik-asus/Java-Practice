// 4 . write a program to print even digits in a number

package PracticeQuestions;

public class EvenDigits {
    public static void main(String[] args) {
        int num = 5349;
        while(num > 0){
            int digit = num % 10;
            if(digit%2==0){
                System.out.println(digit+" is even");
            }
            num = num / 10;
        }
    }
}
