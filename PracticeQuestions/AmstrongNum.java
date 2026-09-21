// 8 . write a program to check ARMSTRONG  

package PracticeQuestions;

public class AmstrongNum {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int ncpy = num; // number copy
        int nod = 0; // number of digits
        int sum = 0;
        while(num>0){
            nod++;
            num = num/10;
        }
        while(ncpy>0){
            int digit = (int) Math.pow((ncpy % 10),nod); 
            sum += digit;
            ncpy = ncpy / 10;       
        }
        System.out.println("Original number : "+original);
        System.out.println("Armstrong value : "+sum);
        if(original == sum)
            System.out.println("---Armstrong number---");
        else
            System.out.println("Not an Armstrong number");
    }
}
