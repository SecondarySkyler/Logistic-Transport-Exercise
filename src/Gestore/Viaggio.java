package Gestore;

import Gestore.Autocarro;
import Gestore.Merce;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Viaggio {
    ArrayList ship = new ArrayList();

    public Percorso percorso;
    public Autocarro veicoloInUso;
    public Merce merceTrasportata;

    public Viaggio(Percorso p) {
        this.percorso = p;
    }

    public void addVehicle(Autocarro e) {
        veicoloInUso = e;
        ship.add(veicoloInUso);
    }

    public void addMerce(Merce e) {
        merceTrasportata = e;
        ship.add(merceTrasportata);
    }



    public void info() {
        Iterator it = ship.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString() + ", ");
        }
    }



//    /**
//     * Method that retrieve information about the Viaggio and it stores all the infos in an Arraylist
//     */
//    public ArrayList retrieveInfo(){
//        ArrayList info = new ArrayList();
//        info.add(Partenza.nome);
//        info.add(Destinazione.nome);
//        info.add(veicoloInUso.Targa);
//        info.add(merceTrasportata.Quantità + "/" + veicoloInUso.Capacità);
//        info.add(merceTrasportata.type);
//        return info;
//    }
//
//    public Città retrieveName() {
//        return Partenza;
//    }
//
//    public String retrieveTarga() {
//        return veicoloInUso.Targa;
//    }
//
//    public int retrieveMerceQuantity() {return merceTrasportata.retrieveQuantity();}
//
//    public Merce.Tipo retrieveMerce() {return merceTrasportata.retrieveTipo();}

}