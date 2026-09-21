package exceptionHandling;

// try - finally

public class Example1 {
    public void doSomething(){
        System.out.println("Entry");
        try{
            int a[] = {1,2,3};
            System.out.println(a[2]);
        }
        finally{
            System.out.println("Reached to finally");
        }
        System.out.println("Exit");
    }
    public static void main(String args[]){
        Example1 obj = new Example1();
        obj.doSomething();
    }
}
