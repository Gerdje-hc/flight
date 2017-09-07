/**
 * Created by vdabcursist on 07/09/2017.
 */
public class Passenger {

    public Passenger(String firstname, String lastname, int frequentFlyerMiles) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.frequentFlyerMiles = frequentFlyerMiles;

    }

    public Passenger(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private Integer id;    // int kan niet NULL zijn  - integer wel
    private String firstname;
    private String lastname;
    private int frequentFlyerMiles;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFrequentFlyerMiles() {
        return frequentFlyerMiles;
    }

    public void setFrequentFlyerMiles(int frequentFlyerMiles) {
        this.frequentFlyerMiles = frequentFlyerMiles;
    }

    public String fullName() {
        return getFirstname() + " " + getLastname();


    }
}

