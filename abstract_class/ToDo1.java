// Create a abstract class with AC1 and prepare 1AM and 1CM
// Create another abstract class which extends AC1 prepare 2AM
// create normal class which extends AC2
// create test class and main() to call all the methods

abstract class AC1{
    abstract void m1();
    void m2(){
        System.out.println("Logic 2");
    }
}
abstract class AC2 extends AC1{
    abstract void m3();
    abstract void m4();
}
class C1 extends AC2{
    @Override
    public void m1(){
        System.out.println("Logic 1");
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
class ToDo1 {
    public static void main(String []args){
        AC1 obj1 = new C1();
        AC2 obj2 = new C1();
        obj1.m1();
        obj1.m2();
        obj2.m1();
        obj2.m2();
        obj2.m3();
        obj2.m4();
    }
}
