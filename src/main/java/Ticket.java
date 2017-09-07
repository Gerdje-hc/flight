/**
 * Created by vdabcursist on 07/09/2017.
 */
public class Ticket {
    private int id;

    public Ticket(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

}
