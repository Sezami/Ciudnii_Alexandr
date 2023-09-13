package homework_nr_4;

public class TemperatureConverter {
    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        tc.toCelsius(20);
        tc.toFahrenheit(20);
    }
    public void toCelsius(double fahrenheitTemp){
    double result = (fahrenheitTemp - 32) / 1.8;
        System.out.println("Temperature Converted from Fahrenheit to Celsius is equal to: " + result);


    }
    public void toFahrenheit(double celsiusTemp){
    double result = celsiusTemp * 1.8 + 32;
        System.out.println("Temperature Converted from Celsius to Fahrenheit is equal to: " + result);
    }
}
