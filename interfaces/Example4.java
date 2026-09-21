// 3 interfaces with 1 implemented class

interface A{
    void m1();
    void m2();
}
interface B{
    void m2();
    void m3();
}
interface C extends A,B{
    void m2();
}
class C1 implements C{
    @Override
    public void m1(){
        System.out.println("logic 1 through C1");
    }
    @Override
    public void m2(){
        System.out.println("logic 2 through C1");
    }
    @Override
    public void m3(){
        System.out.println("logic 3 thorugh C1");
    }
}
public class Example4 {
    public static void main(String []args){
        A obj1 = new C1();
        B obj2 = new C1();
        C obj3 = new C1();
        obj1.m1();
        obj1.m2();
        obj2.m2();
        obj2.m3();
        obj3.m1();
        obj3.m2();
        obj3.m3();
    }
}
