package multiThreading;
// multi thread program execution and thread life cycle
// Rule 1 : child should be child of thread class
// Rule 2 : Introduce extra method : run()
// Rule 3 : Call run() method with start() method

// Rule 1 : child should be child of thread class
class JobOne extends Thread{
    void task1() throws Exception{
        for(int i=1;i<=5;i++){
            System.out.println("JobOne: task()1 prints i = "+i);
            Thread.sleep(1000);
        }
    }
    // Rule 2 : Introduce extra method : run()
    @Override
    public void run(){
        try{
            task1();
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
// Rule 1 : child should be child of thread class
class JobTwo extends Thread{
    void task2() throws Exception{
        for(int i=6;i<=10;i++){
            System.out.println("JobTwo: task2() prints j = "+i);
            Thread.sleep(1000);
        }
    }
    // Rule 2 : Introduce extra method : run()
    @Override
    public void run(){
        try{
            task2();
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
public class Example2 {
    public static void main(String[] args) throws Exception{
        JobOne job1 = new JobOne();
        JobTwo job2 = new JobTwo();
        // Rule 3 : Call run() method with start() method
        job1.start();
        job2.start();
    }
}
