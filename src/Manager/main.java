package Manager;
import Gestore.*;
import Customer.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {




    public static void main(String[] args) {

        Città Udine = new Città("Udine");
        Città Milano = new Città("Milano");
        int quantità = 300;
        Merce.Tipo t = Merce.Tipo.Acciaio;

        String targa = "123";
        int  capacity = 1000;
        Merce.Tipo type = Merce.Tipo.Acciaio;
        Autocarro truck1 = new Autocarro(targa, capacity, type);

        Cliente client = new Cliente("Cristian");
        Viaggio required = client.requireShipment(Udine, Milano, quantità, t);
        required.addVehicle(truck1);


        Percorso requiredShipment = new Percorso();
        requiredShipment.addViaggio(required);
        requiredShipment.showList();
        //requiredShipment.cercaPrenotazione(Udine);







        /*
        Viaggio firstSpedition = new Viaggio(Udine, Milano); //creo viaggio
        Città Roma = new Città("Roma");
        Città Napoli = new Città("Napoli");
        Viaggio rm_np = new Viaggio(Roma, Napoli);
        int quantity = 100;
        Percorso percorsi = new Percorso();
        Merce merceDaTrasporto = new Merce(quantity, Merce.Tipo.Acciaio); // creo merce
        Flotta equip = new Flotta();
        String targa = "ABCDEF";
        int truckCapacity = 1000;
        Autocarro camion = new Autocarro(targa, truckCapacity, merceDaTrasporto);
        equip.addTruck(camion);
        String id = "cioa";
        int kg = 10;
        int q = 10;
        Merce merce = new Merce(q, Merce.Tipo.Gas);
        Autocarro iveco = new Autocarro(id, kg ,merce);
        equip.addTruck(iveco);
        rm_np.addVehicle(iveco);
        rm_np.addMerce(merce);
        firstSpedition.addVehicle(camion);
        firstSpedition.addMerce(merceDaTrasporto);
        //firstSpedition.retrieveInfo();
        //System.out.println(Arrays.toString(firstSpedition.retrieveInfo().toArray()));
        percorsi.addViaggio(firstSpedition);
        percorsi.addViaggio(rm_np);
        percorsi.showList();
        percorsi.cercaPrenotazione("ABCDEF");
        percorsi.cercaPrenotazione(Merce.Tipo.Gas);*/



        /*System.out.println(equip.getSize());
        System.out.println(percorsi.getSize());*/

    }
}
