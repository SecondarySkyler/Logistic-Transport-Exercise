package Gestore;

public class Autocarro extends Flotta {
    public String Targa;
    public int Capacità;
    public Merce.Tipo type;

    /**
     * Constructor
     */
    public Autocarro(String targa, int Truckcapacity, Merce.Tipo type) {
        this.Targa = targa;
        this.Capacità = Truckcapacity;
        this.type = type;
    }


    /**
     * Method to store the quantity of Merce q on the truck
     *
     * @param q the instance of Merce
     */
    public void loadMerce(Merce q) {

    }
}
