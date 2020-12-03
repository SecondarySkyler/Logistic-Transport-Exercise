package Gestore;

import Gestore.Eccezioni.CityNotFoundException;
import java.util.*;

public class Percorso {
    private ArrayList<Città> percorso;
    private Città partenza;
    private Città destinazione;

    /**
     * Costruttore per istanziare un Percorso
     * @param p la citta di PARTENZA
     * @param d la citta di ARRIVO
     * E' importante l'ordine delle citta p e d devono rispettare le regole dei @param
     */
    public Percorso(Città p, Città d) {
        partenza = p;
        destinazione = d;
        this.percorso = new ArrayList();
        this.percorso.add(this.partenza);
        this.percorso.add(this.destinazione);
    }

    /**
     * Aggiunge una nuova tappa al percorso
     * @param c la citta da aggiungere
     *  N.B. la citta viene aggiunta tra la Partenza e la Destinazione, perciò è necessario
     *  inserirle in ordine di distanza rispetto alla partenza
     */
    public void addTappa (Città c) {
        this.percorso.add(percorso.size() - 1, c);
    }

    /**
     * Permette di cambiare una tappa all'interno di un'istanza di Percorso
     * @param c la citta da inserire
     * @param r la citta da sostituire
     * @throws CityNotFoundException quando la citta da sostituire non e' presente in this
     */
    public void changeTappa(Città c, Città r) throws CityNotFoundException {
        if (percorso.contains(r)) {
            for (int i = 0; i < percorso.size(); i++) {
                if (percorso.get(i) == r) {
                    percorso.remove(r);
                    percorso.add(i, c);
                }
            }
        } else
            throw new CityNotFoundException();
    }

    /**
     * Permette di visionare gli oggetti presenti in this su standard output
     */
    public void printPercorso() {
        for (int i = 0; i < percorso.size(); i++) {
            System.out.print(percorso.get(i).toString() + ", ");
        }
    }








}