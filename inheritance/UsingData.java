class A{
    protected int data = 100;
    protected void methodFromA(){
        System.out.println("A: Data is : "+this.data);
    }
}
class B extends A{
    protected int data = 1000;
    protected void methodFromB(){
        System.out.println("B: Data is : "+this.data);
        System.out.println("B: Data of parent class is : "+super.data);
    }
}
public class UsingData {
    public static void main(String[] args) {
        B object1 = new B();
        object1.methodFromB();
        object1.methodFromA();
    }
}
