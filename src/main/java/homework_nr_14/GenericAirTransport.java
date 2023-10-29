package homework_nr_14;


import java.io.Serializable;
import java.util.List;


public class GenericAirTransport<T extends Vehicle & Serializable & AirTransportInterface> {

    private T transport;

    public T getTransport() {
        return transport;
    }

    public GenericAirTransport(T transport) {
        this.transport = transport;
    }

    public void printAllVehicleThatCanFly(List<? extends Vehicle> vehicles) {
        for (Vehicle element : vehicles) {
            System.out.println("Vehicle that can fly: " + element);
        }


    }

}
