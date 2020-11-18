package Gestore;

public class Merce {
    public int Quantità;

    public enum Tipo {
        Acciaio, Gas, Cibo
    }
    Tipo type;

    public Merce(int q, Merce.Tipo merce) {
        Quantità = q;
        type = merce;
    }

    public int retrieveQuantity() {
        return Quantità;
    }
    public Tipo retrieveTipo() {
        return type;
    }


}