package exceptionHandling;
// try catch finally
public class Example3 {
    public void doSomeThing(){
        System.out.println("Entry");
        try{
            int a[] = {1,2,3};
            System.out.println(a[5]);
        } catch(Exception e){
            System.out.println("Index not available" + e);
        } finally{
            System.out.println("Reached to the end of the program");
        }
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Example3 obj3 = new Example3();
        obj3.doSomeThing();
    }
}
