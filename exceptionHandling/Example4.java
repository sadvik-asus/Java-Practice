package exceptionHandling;
// try - many catches - finally
// one try can handle only one exception and that too only first one
public class Example4 {
    public void doSomeThing(){
        System.out.println("Entry");
        try{
            int a[] = {1,2,3};
            System.out.println(a[5]);
            String s = "Sadvik";
            System.out.println(s.charAt(30));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("index not available "+e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index not available "+e);
        } finally{
            System.out.println("Reached to the end of the program");
        }
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Example4 obj4 = new Example4();
        obj4.doSomeThing();
    }
}
