package exceptionHandling;

// try - catch

public class Example2 {
    public void doSomeThing(){
        System.out.println("entry");
        try{
            int a[] = {1,2,3};
            System.out.println(a[21]);
        }
        catch(Exception e){
            System.out.println("Index not available " + e);
        }
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Example2 obj2 = new Example2();
        obj2.doSomeThing();
    }
    
}
