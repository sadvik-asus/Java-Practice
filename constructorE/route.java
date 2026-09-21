package constructorE;

class Route{
    private String triptype;
    private String from;
    private String to;
    private String departure;
    private String travellers;
    private String cabinclass;
    private String faretype;

    // constructor
    public Route(String triptype,String from,String to,String departure,String travellers,String cabinclass,String faretype){
        this.triptype = triptype;
        this.from = from;
        this.to = to;
        this.departure = departure;
        this.travellers = travellers;
        this.cabinclass = cabinclass;
        this.faretype = faretype;
    }
    public String toString(){
        return "Trip type: "+this.triptype+
                "\nFrom: "+this.from+
                "\nTo: "+this.to+
                "\nDeparture: "+this.departure+
                "\nTravellers: "+this.travellers+
                "\nCabin class: "+this.cabinclass+
                "\nFare type: "+this.faretype+"\n----------------------------\n";
    }
    public static void main(String[] args) {
        Route route1 = new Route("One Way", "JFK", "LAX", "2026-09-15", "1 Adult", "Economy", "Regular");
        Route route2 = new Route("Round Trip", "LHR", "JFK", "2026-10-01", "2 Adults", "Business", "Flexible");
        Route route3 = new Route("One Way", "DEL", "DXB", "2026-11-20", "1 Adult, 1 Child", "Economy", "Student");
        Route route4 = new Route("Round Trip", "SFO", "NRT", "2026-12-05", "4 Adults", "Premium Economy", "Senior Citizen");
        Route route5 = new Route("Multi-City", "CDG", "SYD", "2027-01-10", "1 Adult", "First Class", "Armed Forces");

        System.out.print(route1.toString());
        System.out.print(route2.toString());
        System.out.print(route3.toString());
        System.out.print(route4.toString());
        System.out.print(route5.toString());
    }
}
