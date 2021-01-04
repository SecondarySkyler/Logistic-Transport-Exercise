package Gestore;

public class Autocarro {
    private String targa;
    private int capacità;
    private Merce.Tipo type;

    /**
     * Constructor
     */
    public Autocarro(String targa, int capacity, Merce.Tipo type) {
        this.targa = targa;
        this.capacità = capacity;
        this.type = type;
    }

    public String getTarga() {
        return targa;
    }

    public Merce.Tipo getType() {
        return type;
    }

    public int getCapacità() {
        return capacità;
    }

    /**
     * Metodo usato per ricavare le informazioni di this
     * @return una stringa contenente targa, capacita e tipo di merce di this
     */
    public String toString() {
        String info = this.targa + ", " + this.capacità + ", " + this.type + ", ";
        return info;
    }
}

