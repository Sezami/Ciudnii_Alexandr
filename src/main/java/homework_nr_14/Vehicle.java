package homework_nr_14;


import java.io.Serializable;

public class Vehicle implements Serializable {

    private String vehicleModel;
    private String vehicleBrand;

    public Vehicle(String vehicleModel, String vehicleBrand) {
        this.vehicleModel = vehicleModel;
        this.vehicleBrand = vehicleBrand;
    }


    public String getVehicleBrand() {
        return vehicleBrand;
    }
    public String getVehicleModel() {
        return vehicleModel;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleModel='" + vehicleModel + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                '}';
    }
}
