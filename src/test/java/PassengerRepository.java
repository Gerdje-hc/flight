import java.util.Collection;
import java.util.List;
import java.util.*;

/**
 * Created by vdabcursist on 07/09/2017.
 */
public class PassengerRepository {
    private List <Passenger> passengerList;
    public PassengerRepository (List<Passenger>passengerList){
        this.passengerList = passengerList;

    }
    public List<Passenger> findAll (){
        return Collection.unmodifiable(passengerList);   // de unmodifiableList maakt dat de lijst onwijzigbaar is
    }
}
