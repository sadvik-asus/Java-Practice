// 7 . write a program to check a num is palindrome

package PracticeQuestions;

public class Palindrome {
    public static void main(String[] args) {
        int num = 5349435;
        int original = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(reverse);
        if(original == reverse)
            System.out.println("palindrome");
    }
}
