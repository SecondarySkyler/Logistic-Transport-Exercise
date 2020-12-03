package Manager;
import Gestore.*;
import Gestore.Eccezioni.CityNotFoundException;


public class main {

    //TODO: Organize main with more method to create instances

    public static void main(String[] args) throws CityNotFoundException {
        Città Udine = new Città("Udine");
        Città Milano = new Città("Milano");
        Città Padova = new Città("Padova");

        Percorso p = new Percorso(Udine, Milano);
        p.addTappa(Padova);
        p.printPercorso();


    }
}
