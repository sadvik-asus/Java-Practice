// Multipath inheritance

interface A{
    void m1();
}
interface B extends A{
    void m2();
}
interface C extends A{
    void m3();
}
interface D extends B,C{
    void m4();
}
class C1 implements D{
    @Override
    public void m1(){
        System.out.println("Logic 1");
    }
    @Override
    public void m2(){
        System.out.println("Logic 2");
    }
    @Override
    public void m3(){
        System.out.println("Logic 3");
    }
    @Override
    public void m4(){
        System.out.println("Logic 4");
    }
}

public class Example5 {
    public static void main(String[] args) {
        A obj1 = new C1();
        B obj2 = new C1();
        C obj3 = new C1();
        D obj4 = new C1();
        obj1.m1();
        obj2.m1();
        obj2.m2();
        obj3.m1();
        obj3.m3();
        obj4.m1();
        obj4.m2();
        obj4.m3();
        obj4.m4();
    }
}
