package multiThreading;
// Thread Synchronization
class BMS{
    int totalTickets = 10;
    void getTickets(int requiredTickets){
        System.out.println("Total tickets are : ");
        if(totalTickets >= requiredTickets){
            for(int i=0;i<=requiredTickets;i++){
                System.out.println("Ticket "+i+" is issued to "+Thread.currentThread().getName());
            }
            try{
                Thread.sleep(1000);
            } catch(Exception e){
                e.printStackTrace();
            }
            totalTickets -= 1;
        }
        else{
            System.out.println("Tickets are not available");
        }
    }
}
class User1 extends Thread{
    BMS ob;
    User1(BMS ob){
        this.ob = ob;
    }
    @Override
    public void run(){
        ob.getTickets(7);
    }
}
class User2 extends Thread{
    BMS ob;
    User2(BMS ob){
        this.ob = ob;
    }
    @Override
    public void run(){
        ob.getTickets(8);
    }
}
public class Example4 {
    public static void main(String[] args) {
        BMS ob = new BMS();
        User1 thread1 = new User1(ob);
        User2 thread2 = new User2(ob);

        thread1.start();
        thread2.start();
    }
}
