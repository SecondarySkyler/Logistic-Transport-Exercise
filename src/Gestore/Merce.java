package Gestore;

public class Merce {
    private int quantità;

    /**
     * Enum class for Tipo di merce
     */
    public enum Tipo {
        Acciaio, Gas, Cibo
    }
    Tipo type;

    /**
     * Constructor
     * @param q quantita della merce
     * @param merce tipo della merce
     */
    public Merce(int q, Merce.Tipo merce) {
        quantità = q;
        type = merce;
    }

    public String toString() {
        String info = this.type + ", " + this.quantità;
        return info;
    }




}