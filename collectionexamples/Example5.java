package collectionexamples;

import java.util.ArrayList;
import java.util.List;

class Laptop{
    private String brand;
    private int id;
    private String processor ;

    public Laptop(String brand, int id, String processor){
        this.brand= brand;
        this.id= id;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return brand+" "+id+" "+processor;
    }
    
}
public class Example5{
    public static void main(String[] args) {
        List <Laptop> Laptoplist = new ArrayList<>();
        Laptop l1 = new Laptop("Asus", 0,"AMD R7");
        Laptop l2 = new Laptop("HP",1,"intel i5");

        Laptoplist.add(l1);
        Laptoplist.add(l2);

        System.out.println(Laptoplist);
        
    }
}

  

