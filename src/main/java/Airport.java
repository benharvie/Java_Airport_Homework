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
}
