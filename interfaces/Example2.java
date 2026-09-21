// two individual interfaces with one class

package interfaces;

interface A{
    void method1();
    void method2();
    void method3();
}
interface B{
    void method4();
    void method5();
}
class C1 implements A,B{
    public void method1(){
        System.out.println("Logic 1");
    }
    public void method2(){
        System.out.println("Logic 2");
    }
    public void method3(){
        System.out.println("Logic 3");
    }
    public void method4(){
        System.out.println("Logic 4");
    }
    public void method5(){
        System.out.println("Logic 5");
    }
}
class Test{
    public static void main(String[] args) {
        A obj1 = new C1();
        B obj2 = new C1();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj2.method4();
        obj2.method5();
    }
}
