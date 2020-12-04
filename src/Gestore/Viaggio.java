package Gestore;


public class Viaggio {


    private Percorso percorso;
    private Autocarro veicoloInUso;
    private Merce merceTrasportata;

    /**
     * Construttore per l'istanza di Viaggio
     * @param p il percorso su cui si svolgera la spedizione
     * @param a l'autocarro per la spedizione
     * @param m la merce che verra trasportata
     */
    public Viaggio(Percorso p, Autocarro a, Merce m) {
        this.percorso = p;
        this.veicoloInUso = a;
        this.merceTrasportata = m;
    }


    public void info() {
        // iteratore che tira fuori:
        // i nomi delle citta nel percorso
        // la targa dell'autocarro associato al Viaggio
        // la merce, con quantita e tipo
    }
}