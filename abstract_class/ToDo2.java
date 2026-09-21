/*
create an interface I1 with two abstract methods
create an interface I2 with two abstract methods
create abstract class with name AC1 with 2 abstract methods and 2 concrete methods
create a normal class C1 which extends Ac1 and which implements I1 and I2
 */

interface I1{
    void m1();
    void m2();
}
interface I2{
    void m3();
    void m4();
}
abstract class AC1{
    abstract void m5();
    abstract void m6();
    void m7(){
        System.out.println("Logic 7");
    }
    void m8(){
        System.out.println("Logic 8");
    }
}
class C1 extends AC1 implements I1,I2{
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
    @Override
    public void m5(){
        System.out.println("Logic 5");
    }
    @Override
    public void m6(){
        System.out.println("Logic 6");
    }

}
public class ToDo2 {
    public static void main(String[] args) {
        I1 obj1 = new C1();
        I2 obj2 = new C1();
        AC1 obj3 = new C1();
        obj1.m1();
        obj1.m2();
        obj2.m3();
        obj2.m4();
        obj3.m5();
        obj3.m6();
        obj3.m7();
        obj3.m8();

    }
}
