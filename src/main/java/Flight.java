import java.util.ArrayList;

public class Flight extends Plane{
    private ArrayList<Pilot>pilots;
    private ArrayList<CabinCrewMember>cabinCrewMembers;
    private ArrayList<Passenger>passengers;
    private int flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(String planeType, int capacity, int totalWeight, int flightNo, String destination, String departureAirport, String departureTime){
        super(planeType, capacity, totalWeight);
        this.flightNo=flightNo;
        this.destination=destination;
        this.departureAirport=departureAirport;
        this.departureTime=departureTime;
        this.pilots=new ArrayList<Pilot>();
        this.cabinCrewMembers=new ArrayList<CabinCrewMember>();
        this.passengers=new ArrayList<Passenger>();
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepatureTime() {
        return departureTime;
    }
    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }
    public int checkPassengers(){
        return this.passengers.size();
    }
    public int findRemainingCapacity(){
        int bookedPassengers=passengers.size();
        int remainingCapacity=this.capacity-bookedPassengers;
        return remainingCapacity;
    }
}
