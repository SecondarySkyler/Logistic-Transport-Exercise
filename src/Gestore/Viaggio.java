package Gestore;


import java.time.LocalDate;

public class Viaggio {

    private LocalDate giornoDiPrenotazione;
    private LocalDate giornoDiConsegna;
    private Percorso percorso;
    private Autocarro veicoloInUso;
    private Merce merceTrasportata;

    /**
     * Construttore per l'istanza di Viaggio
     * @param p il percorso su cui si svolgera la spedizione
     * @param a l'autocarro per la spedizione
     * @param m la merce che verra trasportata
     */
    public Viaggio(LocalDate gdp, LocalDate gdc, Percorso p, Autocarro a, Merce m) {
        this.giornoDiPrenotazione = gdp;
        this.giornoDiConsegna = gdc;
        this.percorso = p;
        this.veicoloInUso = a;
        this.merceTrasportata = m;
    }

    /** return this.percorso */
    public Percorso getPercorso() {
        return percorso;
    }

    /** return this.veicoloInUso */
    public Autocarro getAutocarro() {
        return veicoloInUso;
    }

    @Override
    public String toString() {
        return "Viaggio{" +
                "giornoDiPrenotazione = " + giornoDiPrenotazione + "\n" +
                ", giornoDiConsegna = " + giornoDiConsegna + "\n" +
                ", percorso = " + percorso + "\n" +
                ", veicoloInUso = " + veicoloInUso + "\n" +
                ", merceTrasportata = " + merceTrasportata +
                '}';
    }
}