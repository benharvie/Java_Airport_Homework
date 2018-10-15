import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> hangar;
    private AirportCode code;

    public Airport(AirportCode code){
        this.code = code;
        this.hangar = new ArrayList<>();
    }

    public AirportCode getCode() {
        return code;
    }

    public ArrayList getPlanes() {
        return hangar;
    }

    public void addPlaneToHanger(Plane plane){
        hangar.add(plane);
    }

    public Flight createFlight(int flightNumber, String destination) {
        return new Flight(hangar.get(0), flightNumber, destination);
    }
}
