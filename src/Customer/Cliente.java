package Customer;

import Gestore.City;
import Gestore.Merce;
import Gestore.Shipment;

public class Cliente {
    /* This class represent the client class, it should be able
    to require a shipment from A to B
     */
    public final String name;

    public Cliente (String name) {
        this.name = name;
    }

    public Shipment requireShipment(City from, City destination, int quantity, Merce.Tipo t) {
        return createShipment(from, destination, quantity, t);
    }


    /**
     * Method that allows a customer to place a shipment
     * @param from the City where to pickup the shipment
     * @param destination the City where to end the shipment
     * @param quantity of the Merce to ship
     * @param t Tipo of Merce
     */
    private Shipment createShipment(City from, City destination, int quantity, Merce.Tipo t) {
        Shipment requiredViaggio = new Shipment(from, destination);
        Merce merceToTransport = new Merce(quantity, t);
        requiredViaggio.addMerce(merceToTransport);
        return requiredViaggio;
    }
}
