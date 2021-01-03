package Gestore;

import java.time.LocalDate;

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
    private LocalDate giornoDiPrenotazione;
    private LocalDate giornoDiConsegna;
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

    public ViaggioBuilder booked () {
        this.giornoDiPrenotazione = LocalDate.now();
        return this;
    }

    /**
     * Set the delivery date
     * @param dt stands for delivery time, it is the amount of day for the Merce to be shipped
     * @return this
     */
    public ViaggioBuilder willArrive (int dt) {
        this.giornoDiConsegna = this.giornoDiPrenotazione.plusDays(dt);
        return this;
    }

    public Viaggio build () {
        return new Viaggio(giornoDiPrenotazione, giornoDiConsegna, percorso, veicoloInUso, merceTrasportata);
    }

}
