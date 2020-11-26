package Gestore;

import java.util.ArrayList;

import java.util.Date;


public class Shipment {
    public City Partenza;
    public City Destinazione;
    public Autocarro veicoloInUso;
    public Merce merceTrasportata;
    public Date initalDate;
    public Date endDate;

    public Shipment(City from, City to) {
        Partenza = from;
        Destinazione = to;
    }

    public void addVehicle(Autocarro truck) {
        veicoloInUso = truck;
    }

    public void addMerce(Merce m) {
        merceTrasportata = m;
    }

    public void addDate(Date date1, Date date2) {
        initalDate = date1;
        endDate = date2;
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
        info.add(initalDate);
        info.add(endDate);
        return info;
    }
//
//    public City retrieveName() {
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