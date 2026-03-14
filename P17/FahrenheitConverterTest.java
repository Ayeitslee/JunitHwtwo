import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FahrenheitConverterTest {
    FahrenheitConverter converter = new FahrenheitConverter();

    @Test
    void testAbsoluteZeroBoundary() {
        // min: Exact Absolute Zero
        assertEquals(0.0, converter.convertToKelvin(-459.67), 0.01);
    }

    @Test
    void testBelowAbsoluteZero() {
        // min-: Below Absolute Zero (Should throw the error message from your readme)
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            converter.convertToKelvin(-460.0);
        });
        assertEquals("Error: Temperature cannot be below absolute zero (-459.67°F).", exception.getMessage());
    }

    @Test
    void testStandardTemperature() {
        // Equivalence Partition: Freezing point of water
        assertEquals(273.15, converter.convertToKelvin(32.0), 0.01);
    }
}
