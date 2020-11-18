package Gestore;

import Gestore.Autocarro;

import java.util.ArrayList;


public class Flotta {
    public ArrayList<Autocarro> flotta;


    /**
     * Constructor
     */
    public Flotta () {
        this.flotta = new ArrayList<Autocarro>();

    }

    /**
     * Method used to add an instance of Autocarro to the list of all Autocarro
     * @param e, REQUIRE to be an Autocarro type
     */
    public void addTruck(Autocarro e ){
        this.flotta.add(e);
    }

    /**
     * Method use to retrieve the total number of the trucks
     * @return size
     */
    public int getSize() {
        return this.flotta.size();
    }



}
