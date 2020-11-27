package Manager;
import Gestore.*;
import Gestore.Eccezioni.CityNotFoundException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    //TODO: Organize main with more method to create instances

    public static void main(String[] args) throws CityNotFoundException {

        Città Udine = new Città("Udine");
        Città Milano = new Città("Milano");
        Città Mestre = new Città("Mestre");
        Città Bergamo = new Città("Bergamo");
        Città Manzano = new Città("Manzano");
        Città Torino = new Città("Torino");
        Percorso percorso1 = new Percorso(Udine, Milano);
        int quantità = 300;
        Merce.Tipo t = Merce.Tipo.Acciaio;
        Merce merce = new Merce(quantità, t);

        String targa = "123";
        int  capacity = 1000;
        Merce.Tipo type = Merce.Tipo.Acciaio;
        Autocarro truck1 = new Autocarro(targa, capacity, type);

//        Cliente client = new Cliente("Cristian");
//        Viaggio required = client.requireShipment(Udine, Milano, quantità, t);
//        required.addVehicle(truck1);
//        required.addMerce(merce);
//        required.info();
        percorso1.addTappa(Mestre);
        percorso1.addTappa(Bergamo);
        percorso1.changeTappa(Manzano, Bergamo);
        percorso1.showPercorsi();

//        Percorso requiredShipment = new Percorso();
//        requiredShipment.addViaggio(required);
//        requiredShipment.showList();
//        //requiredShipment.cercaPrenotazione(Udine);






    }
}
