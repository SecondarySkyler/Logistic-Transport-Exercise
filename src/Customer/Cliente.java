//package Customer;
//
//import Gestore.Città;
//import Gestore.Merce;
//import Gestore.Viaggio;
//
//public class Cliente {
//    /* This class represent the client class, it should be able
//    to require a shipment from A to B
//     */
//    public final String name;
//
//    public Cliente (String name) {
//        this.name = name;
//    }
//
//    public Viaggio requireShipment(Città from, Città destination, int quantity,Merce.Tipo t) {
//        return createShipment(from, destination, quantity, t);
//    }
//
//
//    /**
//     * Method that allows a customer to place a shipment
//     * @param from the Città where to pickup the shipment
//     * @param destination the Città where to end the shipment
//     * @param quantity of the Merce to ship
//     * @param t Tipo of Merce
//     */
//    private Viaggio createShipment(Città from, Città destination, int quantity,Merce.Tipo t) {
//        Viaggio requiredViaggio = new Viaggio(from, destination);
//        Merce merceToTransport = new Merce(quantity, t);
//        requiredViaggio.addMerce(merceToTransport);
//        return requiredViaggio;
//    }
//}
