package homework_nr_13.Airplane;

public class Airplane {
    String manufacturer;
    String model;
    int nrOfEngines;

    public Airplane(String manufacturer, String model, int nrOfEngines) throws InvalidAirplaneException {
        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new InvalidManufacturerException("Manufacturer cannot be null or empty");
        }
        this.manufacturer = manufacturer;
        if (model == null || model.isEmpty()) {
            throw new InvalidModelException("Model cannot be null or empty");
        }
        this.model = model;
        if (nrOfEngines <= 0 || nrOfEngines % 2 != 0) {
            throw new InvalidNrOfEnginesException("Number of engines cannot be negative or odd number");

        }
        this.nrOfEngines = nrOfEngines;
    }

    @Override
    public String toString() {
        return "Airplane manufacturer: " + manufacturer +
                " || Model: " + model +
                " || Number of engines: " + nrOfEngines;
    }
}
