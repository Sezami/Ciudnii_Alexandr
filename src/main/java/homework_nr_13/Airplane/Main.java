package homework_nr_13.Airplane;


public class Main {
    public static void main(String[] args) throws InvalidAirplaneException {
        Airplane airplane1 = createAirplaneLBYL("Boeing", "747", 4);
        System.out.println(airplane1.toString());

        Airplane airplane2 = createAirplaneEAFP("Airbus", "340", 4);
        System.out.println(airplane2.toString());

        System.out.println("______________________________________________");


    }


    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer != null && !manufacturer.isEmpty()){
            return new Airplane(manufacturer, model, nrOfEngines);
        } else {
            System.out.println("Manufacturer cannot be null or empty");
            if (model != null && !model.isEmpty()){
                return new Airplane(manufacturer, model, nrOfEngines);
            }else {
                System.out.println("Model cannot be null or empty");
            }if (nrOfEngines > 0 && nrOfEngines % 2 == 0){
                return new Airplane(manufacturer, model, nrOfEngines);
            }else {
                System.out.println("Number of engines cannot be negative or odd number");
            }

        }

        return null;
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (InvalidAirplaneException e) {
            e.printStackTrace();
        }
        return null;
    }


}


