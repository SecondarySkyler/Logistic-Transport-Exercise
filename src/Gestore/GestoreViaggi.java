package Gestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestoreViaggi {

    private List<Viaggio> spedizioniPrenotate;

    public GestoreViaggi() {
        spedizioniPrenotate = new ArrayList<>();
    }

    public void aggiungiNuovo(Viaggio v){
        spedizioniPrenotate.add(v);
    }

//    public Object search(Object e) {
//
//        for (int i = 0; i < spedizioniPrenotate.size(); i++) {
//            Iterator it = spedizioniPrenotate.get(i).ship.iterator();
//            while (it.hasNext()) {
//                Object x = it.next();
//                if (e == x)
//                    return
//            }
//
//        }
//    }


}
