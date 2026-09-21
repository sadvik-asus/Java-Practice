package exceptionHandling;
import java.util.Scanner;
// User defined exceptions

// use defined exception1
class AgeAboveException extends Exception{
    @Override
    public String toString(){
        return this.getClass().getName()+" Age should be below 100" ;
    }
}
// user defined exception2
class NegativeAgeException extends Exception{
    @Override
    public String toString(){
        return this.getClass().getName()+" Age should be a positive number";
    }
}

public class Example8 {
    public void doSomeThing(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your age : ");
            int age = sc.nextInt();
            if(age > 100){
                throw new AgeAboveException();
            }
            if(age < 0){
                throw new NegativeAgeException();
            }
            if(age >= 18){
                System.out.println("Age "+age+" is valid");
            }
        } catch(AgeAboveException e){
            e.printStackTrace();
        } catch(NegativeAgeException e){
            e.printStackTrace();
        } finally{
            System.out.println("finally : End of the program");
        }
    }
    public static void main(String[] args) {
        Example8 obj8 = new Example8();
        obj8.doSomeThing();
    }
}
