package Manager;
import Gestore.*;
import Customer.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class main {

    //TODO: Organize main with more method to create instances
    //TODO: Consider to change Shipment class, let het to be able to store data

    public static void main(String[] args) {

        //data inserted by the customer
        City Udine = new City("Udine");
        City Milano = new City("Milano");
        int quantità = 300;
        Calendar dateOfShipment = Calendar.getInstance();
        Calendar deliveryDate = Calendar.getInstance();
        Merce.Tipo t = Merce.Tipo.Acciaio;
        Merce merce = new Merce(quantità, t);

        //data and constructor for truck
        String targa = "123";
        int  capacity = 1000;
        Merce.Tipo type = Merce.Tipo.Acciaio;
        Autocarro truck1 = new Autocarro(targa, capacity, type);

        Cliente client = new Cliente("Cristian");
        Shipment required = client.requireShipment(Udine, Milano, quantità, t);
        required.addVehicle(truck1);
        required.addMerce(merce);
        required.addDate(dateOfShipment.getTime(), deliveryDate.getTime());

        ArrayList info = required.retrieveInfo();
        System.out.println(Arrays.toString(info.toArray()));

//        Percorso requiredShipment = new Percorso();
//        requiredShipment.addViaggio(required);
//        requiredShipment.showList();


    }
}
