package homework_nr_14;

import java.io.Serializable;

public class Helicopter extends Vehicle implements Serializable, AirTransportInterface{

    public Helicopter(String vehicleName, String vehicleBrand) {
        super(vehicleName, vehicleBrand);
    }
}
