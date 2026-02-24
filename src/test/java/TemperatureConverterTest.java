import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TemperatureConverterTest {

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(-40, converter.fahrenheitToCelsius(-40));
        assertEquals(-17.778, converter.fahrenheitToCelsius(0));
        assertEquals(4.444, converter.fahrenheitToCelsius(40));
    }

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(-40, converter.celsiusToFahrenheit(-40));
        assertEquals(32, converter.celsiusToFahrenheit(0));
        assertEquals(104, converter.celsiusToFahrenheit(40));
    }

    @Test
    void testKelvinToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();

        assertEquals(26.85, converter.kelvinToCelsius(300));
        assertEquals(-273.15, converter.kelvinToCelsius(0));
        assertEquals(726.85, converter.kelvinToCelsius(1000));
    }

    @Test
    void testIsExtremeTemperature() {
        TemperatureConverter converter = new TemperatureConverter();

        assertTrue(converter.isExtremeTemperature(-41));
        assertTrue(converter.isExtremeTemperature(-40.01));
        assertTrue(converter.isExtremeTemperature(51));
        assertTrue(converter.isExtremeTemperature(50.01));

        assertFalse(converter.isExtremeTemperature(-40));
        assertFalse(converter.isExtremeTemperature(-20));
        assertFalse(converter.isExtremeTemperature(0));
        assertFalse(converter.isExtremeTemperature(20));
        assertFalse(converter.isExtremeTemperature(50));
    }
}