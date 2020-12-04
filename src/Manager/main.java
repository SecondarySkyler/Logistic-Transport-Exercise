package Manager;
import Gestore.*;
import Gestore.Eccezioni.CityNotFoundException;


public class main {

    //TODO: Organize main with more method to create instances
    //TODO: Scrivi per Percorso/Autocarro/Merce il metodo toString per poter fare override in iteratore Viaggio

    public static void main(String[] args) throws CityNotFoundException {
        //========== PERCORSO ================
        Città Udine = new Città("Udine");
        Città Milano = new Città("Milano");
        Città Padova = new Città("Padova");

        Percorso p = new Percorso(Udine, Milano);
        p.addTappa(Padova);
        System.out.println(p.toString());

        // ========== AUTOCARRO ===========
        String targa = "ABCDEF";
        int capacita = 1000;
        Merce.Tipo tipoDiMerce = Merce.Tipo.Acciaio;

        Autocarro camion = new Autocarro(targa, capacita, tipoDiMerce);
        System.out.println(camion.toString());

        //========== MERCE ============
        int quantita = 100;
        Merce.Tipo tipo = Merce.Tipo.Acciaio;

        Merce merce = new Merce(quantita, tipo);
        System.out.println(merce.toString());


    }
}
