package Gestore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class GestorePercorsi {
    ArrayList<Percorso> listaPercorsi;

    public GestorePercorsi() {
        listaPercorsi = new ArrayList<>();
    }

    public void addPercorso(Percorso p) {
        this.listaPercorsi.add(p);
    }

    public String toString() {
        Iterator<Percorso> it = new PercorsoIterator(listaPercorsi);
        String nome = "";
        while (it.hasNext()) {
            Percorso next = it.next();
            nome = next.toString();
        }
        return nome;

    }




    private class PercorsoIterator implements Iterator<Percorso> {
        private int index;
        private ArrayList<Percorso> pc;

        PercorsoIterator(ArrayList<Percorso> percorso) {
            Objects.requireNonNull(percorso);
            this.pc = (ArrayList<Percorso>) percorso.clone();
        }

        @Override
        public boolean hasNext() {
            return index < this.pc.size();
        }

        @Override
        public Percorso next() {
            Percorso next = this.pc.get(index);
            index++;
            return next;
        }
    }

}
