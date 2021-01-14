package Manager;
import Gestore.*;
import Gestore.Eccezioni.CityNotFoundException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.TemporalAmount;


public class main {

    //TODO: Organize main with more method to create instances


    public static void main(String[] args) throws CityNotFoundException {
        //========= DATA ====================
        LocalDate gdp = LocalDate.now();
        int deliveryTime = 3; // giorni previsti di consegna
        LocalDate gdc = gdp.plusDays(deliveryTime);

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
//        Viaggio viaggio = new Viaggio(gdp, gdc, p, camion, merce);
//        System.out.println(viaggio.toString());

        /** viaggio with builder */
        Viaggio v = ViaggioBuilder.newBuilder("Udine", "Catania")
                .withVehicle("123", 1000, Merce.Tipo.Acciaio)
                .willShip(100, Merce.Tipo.Acciaio)
                .booked()
                .willArrive(5)
                .build()
                ;
//        System.out.println(v.toString());
        System.out.println("Fine parte Viaggio");


        //========= GESTORE VIAGGI =======
        GestoreViaggi gv = new GestoreViaggi();
//        gv.addViaggio(viaggio);
        gv.addViaggio(v);
//        System.out.println(gv.cercaPrenotazione(Udine).toString());
//        System.out.println(gv.cercaPrenotazionePerAutocarro("123").toString());
//        System.out.println(gv.cercaPrenotazionePerData("2021-01-04").toString());
        System.out.println(gv.cercaPrenotazionePerCitta("Udine"));
        System.out.println("Fine parte GestoreViaggi");








    }
}
