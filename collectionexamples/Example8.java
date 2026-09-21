package collectionexamples;

import java.util.Vector;

class Bus{
    private String travellerName;
    private String busNumber;
    private int fare;
    private String departureLocation;
    private String arrivalLocation;
    private int rating;
    public Bus(String travellerName, String busNumber, int fare, String departureLocation, String arrivalLocation,
            int rating) {
        this.travellerName = travellerName;
        this.busNumber = busNumber;
        this.fare = fare;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.rating = rating;
    }
    public String getTravellerName() {
        return travellerName;
    }
    public void setTravellerName(String travellerName) {
        this.travellerName = travellerName;
    }
    public String getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }
    public int getFare() {
        return fare;
    }
    public void setFare(int fare) {
        this.fare = fare;
    }
    public String getDepartureLocation() {
        return departureLocation;
    }
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }
    public String getArrivalLocation() {
        return arrivalLocation;
    }
    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    @Override
    public String toString() {
        return "Bus [travellerName=" + travellerName + ", busNumber=" + busNumber + ", fare=" + fare
                + ", departureLocation=" + departureLocation + ", arrivalLocation=" + arrivalLocation + ", rating="
                + rating + "]";
    }
    
}
public class Example8 {
    public static void main(String[] args) {
        Vector <Bus> busVector = new Vector<>();
        Bus b1 = new Bus("Rahul Sharma", "TS09Z1024", 1250, "Hyderabad", "Bengaluru", 4);
        Bus b2 = new Bus("Priya Patel", "AP28TV5521", 850, "Hyderabad", "Vijayawada", 5);
        Bus b3 = new Bus("Amit Verma", "KA01MJ8840", 1600, "Bengaluru", "Goa", 4);

        busVector.add(b1);
        busVector.add(b2);
        busVector.add(b3);

        System.out.println(busVector);
    }
}
