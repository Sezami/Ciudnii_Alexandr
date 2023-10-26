package homework_nr_14;


import java.io.Serializable;

public class Airplane extends Vehicle implements Serializable, AirTransportInterface {


    public Airplane(String vehicleModel, String vehicleBrand) {
        super(vehicleModel, vehicleBrand);
    }
}
