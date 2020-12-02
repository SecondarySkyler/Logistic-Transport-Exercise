package Gestore;

import Gestore.Eccezioni.CityNotFoundException;
import java.util.*;

public class Percorso {
    ArrayList<Città> percorso;
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
     * Mostra la lista dei percorsi disponibili
     */
    public void showPercorsi() {
        for (int i = 0; i < percorso.size(); i++) {
            String nomeCitta = percorso.get(i).nome;
            System.out.println(nomeCitta + ", ");
        }
    }

    public void search(Città c) {
        Iterator it = percorso.iterator();
        while (it.hasNext()) {
            Object x = it.next();
            if (x instanceof Città)
                System.out.println(c.nome);
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        Iterator<Città> it = percorso.iterator();
        while (it.hasNext()) {
            String city = it.next().nome;
            sb.append(city + ", ");
        }
        return sb.toString();
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