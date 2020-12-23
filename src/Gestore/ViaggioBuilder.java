package Gestore;

public class ViaggioBuilder {

    //Citta
    private String partenza;
    private String destinazione;
    //Autocarro
    private String targa;
    private int capacity;
    private Merce.Tipo tipoDiMerce;
    //Merce
    private int quantita;
    private Merce.Tipo tipo;

    //Oggetti necessari per la creazione di un'istanza di Viaggio
    private Percorso percorso;
    private Autocarro veicoloInUso;
    private Merce merceTrasportata;


    private ViaggioBuilder(String p, String d) {
        this.percorso = new Percorso(new Città(p), new Città(d));
    }

    /** Constructor */
    public static ViaggioBuilder newBuilder(String p, String d) {
        return new ViaggioBuilder(p,d);
    }

    public ViaggioBuilder withVehicle (String t, int c, Merce.Tipo mt) {
        this.veicoloInUso = new Autocarro(t, c, mt);
        return this;
    }

    public ViaggioBuilder willShip (int q, Merce.Tipo m) {
        this.merceTrasportata = new Merce(q, m);
        return this;
    }

    public Viaggio build () {
        return new Viaggio(percorso, veicoloInUso, merceTrasportata);
    }

}
