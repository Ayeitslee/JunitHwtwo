public class FahrenheitConverter {
    public double convertToKelvin(double fahrenheit) {
        // Boundary check for Absolute Zero
        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Error: Temperature cannot be below absolute zero (-459.67°F).");
        }
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
}
