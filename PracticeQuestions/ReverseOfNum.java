// 6 . write a java program to print reverse of a number

package PracticeQuestions;

public class ReverseOfNum {
    public static void main(String[] args) {
        int num = 5349;
        int reverse = 0;
        System.out.println("Original number : "+num);
        System.out.print("Reverse of number : ");
        while(num > 0){
            int digit = num % 10;
            //reverse = reverse*10 + digit;
            num = num/10;
            System.out.print(digit);
        }
    }
}
