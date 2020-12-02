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
        Percorso percorso2 = new Percorso(Mestre, Torino);
        GestorePercorsi gp = new GestorePercorsi();
        gp.addPercorso(percorso1);
        gp.addPercorso(percorso2);
        int quantità = 300;
        Merce.Tipo t = Merce.Tipo.Acciaio;
        Merce merce = new Merce(quantità, t);

        String targa = "123";
        int capacity = 1000;
        Merce.Tipo type = Merce.Tipo.Acciaio;
        Autocarro truck1 = new Autocarro(targa, capacity, type);
         String targa1 = truck1.getTarga();
         targa1 = "abce";
        System.out.println(targa);
         System.out.println(targa1);
         truck1.targa = "ciao";
        System.out.println(targa);


//        Viaggio viaggio = new Viaggio(percorso1);
//        viaggio.addVehicle(truck1);
//        viaggio.addMerce(merce);
//        viaggio.info();

//        percorso1.showPercorsi();
//        percorso2.showPercorsi();



    }
}
