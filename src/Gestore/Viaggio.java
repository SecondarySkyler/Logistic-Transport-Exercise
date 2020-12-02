package Gestore;


public class Viaggio {


    public Percorso percorso;
    public Autocarro veicoloInUso;
    public Merce merceTrasportata;

    public Viaggio(Percorso p) {
        this.percorso = p;

    }

    public void addVehicle(Autocarro e) {
        veicoloInUso = e;

    }

    public void addMerce(Merce e) {
        merceTrasportata = e;
    }

    public void info() {
        // iteratore che tira fuori:
        // i nomi delle citta nel percorso
        // la targa dell'autocarro associato al Viaggio
        // la merce, con quantita e tipo
    }
}