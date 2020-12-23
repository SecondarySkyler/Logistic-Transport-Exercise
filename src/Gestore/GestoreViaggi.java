package Gestore;

import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class GestoreViaggi {

    /**
     * MISSION: questa classe deve permettere la raccolta di tutte le istanze di Viaggio
     * in modo tale da poter ricercare per parametro, le spedizioni correlate
     * es. : voglio poter cercare tutte le spedizioni che partono da A
     *       voglio poter cercare la spedizione effettuata dal camion con targa "abc"
     */

    List<Viaggio> prenotazioni;

    /** Constructor */
    public GestoreViaggi() {
        prenotazioni = new Vector<Viaggio>();
    }

    /**
     * Aggiunge un' istanza di Viaggio a this
     * @param v
     */
    public void addViaggio(Viaggio v) {
        this.prenotazioni.add(v);
    }

    /**
     *
     * @param p citta per la quale si vuole cercare una o piu' istanze di Viaggio
     * @return una lista con tutte le istanze di Viaggio con Viaggio.partenza == p
     */
    public List<Viaggio> cercaPrenotazione(Città p) {
        return prenotazioni.stream()
                .filter(viaggio -> viaggio.getPercorso().getPartenza() == p )
                .collect(Collectors.toList());
    }


    public List<Viaggio> cercaPrenotazione(String t) {
        return prenotazioni.stream()
                .filter(viaggio -> viaggio.getAutocarro().getTarga() == t)
                .collect(Collectors.toList());
    }


}
