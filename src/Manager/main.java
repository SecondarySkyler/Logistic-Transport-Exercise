package Manager;
import Gestore.*;
import Gestore.Eccezioni.CityNotFoundException;


public class main {

    //TODO: Organize main with more method to create instances


    public static void main(String[] args) throws CityNotFoundException {
        //========== PERCORSO ================
        Città Udine = new Città("Udine");
        Città Milano = new Città("Milano");
        Città Padova = new Città("Padova");

        Percorso p = new Percorso(Udine, Milano);
        p.addTappa(Padova);
//        System.out.println(p.toString());

        // ========== AUTOCARRO ===========
        String targa = "ABCDEF";
        int capacita = 1000;
        Merce.Tipo tipoDiMerce = Merce.Tipo.Acciaio;

        Autocarro camion = new Autocarro(targa, capacita, tipoDiMerce);
//        System.out.println(camion.toString());

        //========== MERCE ============
        int quantita = 100;
        Merce.Tipo tipo = Merce.Tipo.Acciaio;

        Merce merce = new Merce(quantita, tipo);
//        System.out.println(merce.toString());


        //======== VIAGGIO ============
        Viaggio viaggio = new Viaggio(p, camion, merce);
        System.out.println(viaggio.toString());

        /** viaggio with builder */
        Viaggio v = ViaggioBuilder.newBuilder("Roma", "Catania")
                .withVehicle("123", 1000, Merce.Tipo.Acciaio)
                .willShip(100, Merce.Tipo.Acciaio)
                .build()
                ;
        System.out.println(v.toString());
        System.out.println("Fine parte Viaggio");


        //========= GESTORE VIAGGI =======
        GestoreViaggi gv = new GestoreViaggi();
        gv.addViaggio(viaggio);
        gv.addViaggio(v);
        System.out.println(gv.cercaPrenotazione(Udine).toString());
        System.out.println(gv.cercaPrenotazione("123").toString());




    }
}
