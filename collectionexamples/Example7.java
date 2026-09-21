package collectionexamples;

import java.util.Stack;

class Train{
    private int number;
    private String name;
    private String fromLocation;
    private String toLocation;
    private String totalJourneyTime;
    private int fare;

    public Train(int number, String name, String fromLoctation, String toLocation, String totalJourneyTime, int fare){
        this.number = number;
        this.name = name;
        this.fromLocation = fromLoctation;
        this.toLocation = toLocation;
        this.totalJourneyTime = totalJourneyTime;
        this.fare = fare;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getTotalJourneyTime() {
        return totalJourneyTime;
    }

    public void setTotalJourneyTime(String totalJourneyTime) {
        this.totalJourneyTime = totalJourneyTime;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Train [number=" + number + ", name=" + name + ", fromLocation=" + fromLocation + ", toLocation="
                + toLocation + ", totalJourneyTime=" + totalJourneyTime + ", fare=" + fare + "]";
    }
    
}

public class Example7 {
    public static void main(String[] args) {
        Stack <Train> trainStack = new Stack<>();
        Train t1 = new Train(12723, "Telangana Express", "Hyderabad", "New Delhi", "26h 40m", 2150);
        Train t2 = new Train(20607, "Vande Bharat Express", "Chennai Central", "Mysuru", "6h 30m", 1200);
        Train t3 = new Train(12951, "Mumbai Rajdhani Express", "Mumbai Central", "New Delhi", "15h 32m", 2980);

        trainStack.add(t1);
        trainStack.add(t2);
        trainStack.add(t3);

        System.out.println(trainStack);

        System.out.println(trainStack.peek());
        
    }
}
