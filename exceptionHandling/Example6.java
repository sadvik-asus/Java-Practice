package exceptionHandling;

// try - many catches - finally
// nested try

public class Example6 {
    public void doSomething(){
        System.out.println("Entry");
        try{ // outer try
            try{  // Inner try 1
                System.out.println("--------Inner Try 1--------");
                System.out.println(100/0);
            } catch(ArithmeticException e){
                System.out.println("Inner catch 1 : Cannot divide by zero");
            }finally{
                System.out.println("try - catch - finally1");
            }

            try{  // inner try 2
                System.out.println("--------Inner Try 2--------");
                String s = "Hello";
                System.out.println(s.charAt(30));
            } catch(StringIndexOutOfBoundsException e){
                System.out.println("Inner catch 2 : String index not available");
            } finally{
                System.out.println("try - catch - finally2");
            }
            System.out.println("--------Outer Try Logic--------");
            int a[] = {10};
            System.out.println(a[30]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer Catch : Array Index not available");
        } finally{
            System.out.println("Outer finally : reached to the end of the program");
        }
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Example6 obj6 = new Example6();
        obj6.doSomething();
    }
}
