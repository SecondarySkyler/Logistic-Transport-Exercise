package Gestore;

public class Città {
    private String nome;

    /** Costruttore */
    public Città(String c) {
        this.nome = c;
    }

    /** Metodo per ricavare info sulla citta */
    public String toString() {
        return this.nome;
    }
}
