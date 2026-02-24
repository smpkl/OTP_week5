public class TemperatureConverter {
    // Convert Fahrenheit to Celsius
    public double fahrenheitToCelsius(double f) {
        return (double) Math.round(((f - 32) * 5 / 9) * 1000) / 1000;
    }

    // Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double c) {
        return (double) Math.round((c * 9 / 5 + 32) * 1000) / 1000;
    }

    // Convert Kelvin to Celsius
    public double kelvinToCelsius(double k) {
        return (double) Math.round((k - 273.15) * 1000) / 1000;
    }

    // Check if given temperature is extreme
    public boolean isExtremeTemperature(double temp) {
        return temp < -40 || temp > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println(converter.kelvinToCelsius(300));
    }
}
