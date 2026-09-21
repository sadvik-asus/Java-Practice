class A{
    protected void doTask1(){
        System.out.println("A : Logic 1 is executed");
    }
}
class B extends A {
    protected void doTask2(){
        System.out.println("B : Logic 2 is executed");
    }
}
class SingleLevelTest{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();
        System.out.println("---Class A----");
        obj1.doTask1();
        System.out.println("----Class B----");
        obj2.doTask1();
        obj2.doTask2();
    }
}