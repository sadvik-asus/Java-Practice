package multiThreading;
// thread class methods
class JobA extends Thread{
    @Override
    public void run(){
        System.out.println("Doing task 1 ..........");
    }
}
public class Example3 {
    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        JobA obj1 = new JobA();
        JobA obj2 = new JobA();
        JobA obj3 = new JobA();
        obj1.setName("SPider MaN");
        obj2.setName("Iron man");
        obj3.setName("Captian america");
        System.out.println(obj1.getName());
        System.out.println(obj1.getId());
        System.out.println(obj2.getName());
        System.out.println(obj2.getId());
        System.out.println(obj3.getName());
        System.out.println(obj3.getId());
        System.out.println(obj1.getPriority());
        System.out.println(obj2.getPriority());
        System.out.println(obj3.getPriority());
        obj2.setPriority(9);
        obj1.start();
        Thread.sleep(1000);
        obj2.start();
        Thread.sleep(1000);
        obj3.start();
        Thread.sleep(1000);
               
    }
}
