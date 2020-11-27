package Gestore;

import Gestore.Eccezioni.CityNotFoundException;
import java.util.*;

public class Percorso {
    ArrayList<Città> percorsi;
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
        this.percorsi = new ArrayList();
        this.percorsi.add(this.partenza);
        this.percorsi.add(this.destinazione);
    }

    /**
     * Aggiunge una nuova tappa al percorso
     * @param c la citta da aggiungere
     *  N.B. la citta viene aggiunta tra la Partenza e la Destinazione, perciò è necessario
     *  inserirle in ordine di distanza rispetto alla partenza
     */
    public void addTappa (Città c) {
        this.percorsi.add(percorsi.size() - 1, c);
    }

    public void changeTappa(Città c, Città r) throws CityNotFoundException {
        if (percorsi.contains(r)) {
            for (int i = 0; i < percorsi.size(); i++) {
                if (percorsi.get(i) == r) {
                    percorsi.remove(r);
                    percorsi.add(i, c);
                }
            }
        } else
            throw new CityNotFoundException();
    }

    public void showPercorsi() {
        for (int i = 0; i < percorsi.size(); i++) {
            String nomeCitta = percorsi.get(i).nome;
            System.out.print(nomeCitta + ", ");
        }
    }

    public void search(Città c) {
        Iterator it = percorsi.iterator();
        while (it.hasNext()) {
            Object x = it.next();
            if (x instanceof Città)
                System.out.println(c.nome);
        }
    }


//
//    /**
//     * Method to see every single Viaggio
//     */
//    public void showList(){
//        int length = this.percorsi.size();
//        ArrayList info = new ArrayList();
//        for (int i = 0; i < length; i++) {
//            info = percorsi.get(i).retrieveInfo();
//            System.out.println(Arrays.toString(info.toArray()));
//        }
//    }
//
//    /**
//     * Method to search a Prenotazione, it returns the trip with the Città c associated
//     * @param c the Città used to retrieve inforamtion about
//     */
//    public void cercaPrenotazione(Città c) {
//        int length = this.percorsi.size();
//        ArrayList result = new ArrayList();
//        for (int i = 0; i < length; i++) {
//            if (c == percorsi.get(i).retrieveName()) {
//                result.add(percorsi.get(i).retrieveInfo());
//            }
//        }
//        System.out.println(Arrays.toString(result.toArray()));
//
//    }
//
//    public void cercaPrenotazione(String t) {
//        int length = this.percorsi.size();
//        ArrayList result = new ArrayList();
//        for (int i = 0; i < length; i++) {
//            if (t == percorsi.get(i).retrieveTarga()) {
//                result.add(percorsi.get(i).retrieveInfo());
//            }
//        }
//        System.out.println(Arrays.toString(result.toArray()));
//
//    }
//
//    public void cercaPrenotazione(Merce.Tipo m) {
//        int length = this.percorsi.size();
//        ArrayList result = new ArrayList();
//        for (int i = 0; i < length; i++) {
//            if (m == percorsi.get(i).retrieveMerce()) {
//                result.add(percorsi.get(i).retrieveInfo());
//            }
//        }
//        System.out.println(Arrays.toString(result.toArray()));
//    }


}