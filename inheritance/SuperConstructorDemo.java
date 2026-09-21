class A {
    protected int parentData;

    // Parent Class Constructor
    protected A(int data) {
        this.parentData = data;
        System.out.println("Parent (Class A) Constructor called with data = " + this.parentData);
    }
}

class B extends A {
    protected int childData;

    // Child Class Constructor
    protected B(int parentValue, int childValue) {
        super(parentValue); // Step 1: Passes 'parentValue' up to Parent Class A constructor
        
        this.childData = childValue; // Step 2: Stores childValue in Class B
        System.out.println("Child (Class B) Constructor called with data = " + this.childData);
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        // Creating object of Child Class B and passing values from main
        B object1 = new B(100, 1000);
        System.out.println(object1.toString());
    }
}