// swapping of two numbers using generic methods

package collectionexamples ;

public class Example2 <A>{
    void swap(A x, A y){
        A temp = x;
        x = y;
        y = temp;
        System.out.println("X = "+x+" ,y = "+y);
    }
    public static void main(String[] args) {
        Example1 obj1 = new Example1();
        obj1.swap(100, 200);
        Example1 obj2 = new Example1();
        obj2.swap(99.99F,66.66F);
    }
}
