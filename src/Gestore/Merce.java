package Gestore;

public class Merce {
    private int quantità;

    public enum Tipo {
        Acciaio, Gas, Cibo
    }
    Tipo type;

    public Merce(int q, Merce.Tipo merce) {
        quantità = q;
        type = merce;
    }

    public int retrieveQuantity() {
        return quantità;
    }
    public Tipo retrieveTipo() {
        return type;
    }


}