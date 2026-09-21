// one interface with one implemented class

package interfaces;

interface MyInterface1{
    int data1 = 100;
    int data2 = 200;
    void method1();
    void method2();
}
class MyClass implements MyInterface1{
    @Override
    public void method1(){
        System.out.println("Logic 1");
    }
    @Override
    public void method2(){
        System.out.println("Logic 2");
    }
}
public class Example1 {
    public static void main(String []args){
        MyInterface1 object1 = new MyClass();
        object1.method1();
        object1.method2();
    }
}
