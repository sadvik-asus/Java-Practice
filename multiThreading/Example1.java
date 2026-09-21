package multiThreading;
// single Thread program execution in java
// programs will run sequentially

class job1{
    void task1() throws Exception{
        for(int i=1;i<=5;i++){
            System.out.println("Job1: task1() prints i = "+i);
            Thread.sleep(1000);
        }
    }
}
class job2{
    void task2() throws Exception{
        for(int i =6;i<=10;i++){
            System.out.println("Job2: task2() prints j = "+i);
            Thread.sleep(1000);
        }
    }
}
public class Example1 {
    public static void main(String[] args) throws Exception {
        job1 obj1 = new job1();
        job2 obj2 = new job2();
        obj1.task1();
        obj2.task2();
    }
}
