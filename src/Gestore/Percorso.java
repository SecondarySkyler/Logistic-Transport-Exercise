package Gestore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Percorso {
    ArrayList<Viaggio> percorsi;

    public Percorso() {
        this.percorsi = new ArrayList<Viaggio>();
    }

    public void addViaggio (Viaggio v) {
        this.percorsi.add(v);
    }

    public int getSize() {
        return this.percorsi.size();
    }


    /**
     * Method to see every single Viaggio
     */
    public void showList(){
        int length = this.percorsi.size();
        ArrayList info = new ArrayList();
        for (int i = 0; i < length; i++) {
            info = percorsi.get(i).retrieveInfo();
            System.out.println(Arrays.toString(info.toArray()));
        }
    }

    /**
     * Method to search a Prenotazione, it returns the trip with the Città c associated
     * @param c the Città used to retrieve inforamtion about
     */
    public void cercaPrenotazione(Città c) {
        int length = this.percorsi.size();
        ArrayList result = new ArrayList();
        for (int i = 0; i < length; i++) {
            if (c == percorsi.get(i).retrieveName()) {
                result.add(percorsi.get(i).retrieveInfo());
            }
        }
        System.out.println(Arrays.toString(result.toArray()));

    }

    public void cercaPrenotazione(String t) {
        int length = this.percorsi.size();
        ArrayList result = new ArrayList();
        for (int i = 0; i < length; i++) {
            if (t == percorsi.get(i).retrieveTarga()) {
                result.add(percorsi.get(i).retrieveInfo());
            }
        }
        System.out.println(Arrays.toString(result.toArray()));

    }

    public void cercaPrenotazione(Merce.Tipo m) {
        int length = this.percorsi.size();
        ArrayList result = new ArrayList();
        for (int i = 0; i < length; i++) {
            if (m == percorsi.get(i).retrieveMerce()) {
                result.add(percorsi.get(i).retrieveInfo());
            }
        }
        System.out.println(Arrays.toString(result.toArray()));
    }


}