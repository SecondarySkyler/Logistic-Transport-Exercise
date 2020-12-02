package Gestore;

public class Autocarro  {
    public String targa;
    public int capacità;
    public Merce.Tipo type;

    /**
     * Constructor
     */
    public Autocarro(String targa, int Truckcapacity, Merce.Tipo type) {
        this.targa = targa;
        this.capacità = Truckcapacity;
        this.type = type;
    }


    /**
     * Method to store the quantity of Merce q on the truck
     *
     * @param q the instance of Merce
     */
    public void loadMerce(Merce q) {

    }

    public String getTarga() {
        return this.targa;
    }


}
