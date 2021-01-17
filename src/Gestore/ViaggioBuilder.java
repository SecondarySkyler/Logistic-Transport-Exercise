package Gestore;

import Gestore.Eccezioni.InvalidCapabilityException;
import Gestore.Eccezioni.WrongMerceTypeException;

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

    /**
     * Set a vehicle for the current Viaggio's instance
     * @param t la targa dell'Autocarro
     * @param c la capacita
     * @param mt il tipo di merce che trasporta
     * @return this
     */
    public ViaggioBuilder withVehicle (String t, int c, Merce.Tipo mt) {
        this.veicoloInUso = new Autocarro(t, c, mt);
        return this;
    }

    /**
     * Permette di specificare la Merce che verra trasportata
     * @param q la quantita
     * @param m il tipo di merce
     * @return this
     */
    public ViaggioBuilder willShip (int q, Merce.Tipo m) {
        this.merceTrasportata = new Merce(q, m);
        return this;
    }

    /** Set the current date as the book date (yyyy-MM-dd) */
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

    /**
     * @return an instance of Viaggio
     *
     */
    public Viaggio build () throws WrongMerceTypeException, InvalidCapabilityException {
        try {
            Viaggio v = new Viaggio(giornoDiPrenotazione, giornoDiConsegna, percorso, veicoloInUso, merceTrasportata);
        } catch (WrongMerceTypeException wmte) {
            wmte.printStackTrace();
        } catch (InvalidCapabilityException ice) {
            ice.printStackTrace();
        }
        return new Viaggio(giornoDiPrenotazione, giornoDiConsegna, percorso, veicoloInUso, merceTrasportata);
    }

}
