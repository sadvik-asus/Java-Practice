// 5 . write a java program to print odd digits

package PracticeQuestions;

public class OddDigit {
    public static void main(String[] args) {
        int num = 5349;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 != 0){
                System.out.println(digit+" is odd");
            }
            num = num / 10;
        }
    }
}
