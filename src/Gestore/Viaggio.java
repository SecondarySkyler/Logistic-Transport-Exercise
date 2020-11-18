package Gestore;

import Gestore.Autocarro;
import Gestore.Merce;

import java.util.ArrayList;


public class Viaggio {
    public Città Partenza;
    public Città Destinazione;
    public Autocarro veicoloInUso;
    public Merce merceTrasportata;

    public Viaggio(Città from, Città to) {
        Partenza = from;
        Destinazione = to;
    }

    public void addVehicle(Autocarro e) {
        veicoloInUso = e;
    }

    public void addMerce(Merce e) {
        merceTrasportata = e;
    }

    /**
     * Method that retrieve information about the Viaggio and it stores all the infos in an Arraylist
     */
    public ArrayList retrieveInfo(){
        ArrayList info = new ArrayList();
        info.add(Partenza.nome);
        info.add(Destinazione.nome);
        info.add(veicoloInUso.Targa);
        info.add(merceTrasportata.Quantità + "/" + veicoloInUso.Capacità);
        info.add(merceTrasportata.type);
        return info;
    }

    public Città retrieveName() {
        return Partenza;
    }

    public String retrieveTarga() {
        return veicoloInUso.Targa;
    }

    public int retrieveMerceQuantity() {return merceTrasportata.retrieveQuantity();}

    public Merce.Tipo retrieveMerce() {return merceTrasportata.retrieveTipo();}

}