package exceptionHandling;

// try - many catches - finally
// Rule : parent (Exception class) last ..childs(Exception class methods) first
public class Example5{
    public void doSomething(){
        System.out.println("Entry");
        try{
            int a[] = {10};
            System.out.println(a[20]/0);
            String s = "Hello" ;
            System.out.println(s.charAt(30));
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is not available");
        } catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("String index is not available");
        } catch(Exception e){
            System.out.println("You got "+e+" Exception");
        }
        finally{
            System.out.println("reached to the end of the program");
        }
        System.out.println("Exit");
    }
    public static void main(String[] args) {
        Example5 obj5 = new Example5();
        obj5.doSomething();
    }
}