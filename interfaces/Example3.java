interface A{
    void m1();
    void m2();
}
interface B extends A{
    void m3();
    void m4();
}
interface C{
    void m5();
}
class C1 implements B{
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
        System.out.println("logic 3 through C1");
    }
    @Override
    public void m4(){
        System.out.println("logic 4 through C1");
    }
}
class C2 implements A,C{
    @Override
    public void m1(){
        System.out.println("Logic 1 thorugh C2");
    }
    @Override
    public void m2(){
        System.out.println("Logic 2 through C2");
    }
    @Override
    public void m5(){
        System.out.println("Logic 5 through C2");
    }
}
class Example3 {
    public static void main(String[] args) {
        A obj1 = new C2();
        B obj2 = new C1();
        C obj3 = new C2();
        obj1.m1();
        obj1.m2();
        obj2.m1();
        obj2.m2();
        obj2.m3();
        obj2.m4();
        obj3.m5();
    }
}
