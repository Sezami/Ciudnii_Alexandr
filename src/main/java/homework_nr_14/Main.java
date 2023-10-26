package homework_nr_14;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", "747");
        Helicopter helicopter = new Helicopter("Bell", "206");
        Car car = new Car("Opel", "Astra");

        GenericAirTransport<Airplane> airplaneTransport = new GenericAirTransport<>(airplane);
        GenericAirTransport<Helicopter> helicopterTransport = new GenericAirTransport<>(helicopter);
        airplaneTransport.printAllVehicleThatCanFly(List.of(airplane));
        helicopterTransport.printAllVehicleThatCanFly(List.of(helicopter));





    }


}

