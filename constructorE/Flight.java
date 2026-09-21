package constructorE;

class Flight {
    private String arrivalgurantee;
    private String nameofflight;
    private String flightnumber;
    private String departtime;
    private String totalduration;
    private String arrivaltime;
    private double fare;
    private String departurelocation;
    private String arrivallocation;

    // constructor
    public Flight(String arrivalgurantee, String nameofflight, String flightnumber, String departtime, String totalduration, String arrivaltime, double fare, String departurelocation, String arrivallocation){
        this.arrivalgurantee = arrivalgurantee;
        this.nameofflight = nameofflight;
        this.flightnumber = flightnumber;
        this.departtime = departtime;
        this.totalduration = totalduration;
        this.arrivaltime = arrivaltime;
        this.fare = fare;
        this.departurelocation = departurelocation;
        this.arrivallocation = arrivallocation;
    }
    public String toString() {
        return "\nArrival Gurantee   : "+this.arrivalgurantee+
               "\nName of Flight     : "+this.nameofflight+
               "\nFlight Number      : "+this.flightnumber+
               "\nDepart Time        : "+this.departtime+
               "\nTotal Duration     : "+this.totalduration+
               "\nArrival Time       : "+this.arrivaltime+
               "\nFare               : "+fare+
               "\nDeparture Location : "+this.departurelocation+
               "\nArrival Location   : "+this.arrivallocation+"\n----------------------------------";
    }
    public static void main(String[] args) {
        Flight flight1 = new Flight("Yes", "Emirates", "EK201", "08:30 AM", "14h 20m", "05:50 PM", 1250.50, "JFK", "DXB");
        Flight flight2 = new Flight("No", "Delta Air Lines", "DL108", "11:15 AM", "7h 45m", "11:00 PM", 850.00, "LAX", "JFK");
        Flight flight3 = new Flight("Yes", "British Airways", "BA178", "06:00 PM", "7h 10m", "06:10 AM", 940.75, "JFK", "LHR");
        Flight flight4 = new Flight("Yes", "Air India", "AI101", "01:30 AM", "15h 30m", "07:00 AM", 1100.25, "DEL", "JFK");
        Flight flight5 = new Flight("No", "Lufthansa", "LH400", "10:50 AM", "8h 15m", "11:05 PM", 1020.80, "FRA", "JFK");

        System.out.print(flight1.toString());
        System.out.print(flight2.toString());
        System.out.print(flight3.toString());
        System.out.print(flight4.toString());
        System.out.print(flight5.toString());
    }
}

