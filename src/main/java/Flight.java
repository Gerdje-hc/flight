/**
 * Created by vdabcursist on 07/09/2017.
 */
public class Flight {

    private int id;

    public Flight(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    private String flightNumber;
}
