public class Main {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("Convert 300 kelvin to celsius:");
        System.out.println(converter.kelvinToCelsius(300));

        System.out.println("Convert 30 fahrenheit to celsius:");
        System.out.println(converter.fahrenheitToCelsius(30));

        System.out.println("Convert 14 celsius to fahrenheit:");
        System.out.println(converter.celsiusToFahrenheit(14));
    }
}
