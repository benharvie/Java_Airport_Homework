import java.util.ArrayList;

public class Plane {
    private PlaneType type;
    private PlaneAirline airline;
    private ArrayList<String> passengers;

    public Plane(PlaneType type, PlaneAirline airline) {
        this.type = type;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }

    public PlaneType getType() {
        return type;
    }

    public PlaneAirline getAirline() {
        return airline;
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}
