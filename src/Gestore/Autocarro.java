package Gestore;

public class Autocarro {
    private String targa;
    private int capacità;
    private Merce.Tipo type;

    /**
     * Constructor
     */
    public Autocarro(String targa, int Truckcapacity, Merce.Tipo type) {
        this.targa = targa;
        this.capacità = Truckcapacity;
        this.type = type;
    }
}

