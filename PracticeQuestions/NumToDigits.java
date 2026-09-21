//  1 . write a program to divide a number into digits

package PracticeQuestions;
class NumToDigits{
    public static void main(String[] args) {
        int num = 123;
        int reverse = 0;
        System.out.println("Given number : "+num);
        while(num>0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;  
            num = num / 10;
        }
        System.out.println("Digits of number: ");
        while(reverse>0){
            int digit = reverse % 10;
            System.out.println(digit);
            reverse = reverse / 10;
            
        }
    }
}