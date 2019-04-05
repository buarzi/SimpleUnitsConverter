package functions;

import java.math.BigDecimal;

public class Temperature {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "Kelvin":
                    switch (to) {
                        case "Kelvin":
                            return input;
                        case "Celsius":
                            return input - 273.15;
                        case "Fahrenheit":
                            return (input - 273.15) * 1.8 + 32.0;
                        default:
                            return 0.0;
                    }
                case "Celsius":
                    switch (to) {
                        case "Kelvin":
                            return input + 273.15;
                        case "Celsius":
                            return input;
                        case "Fahrenheit":
                            return input * 1.8 + 32.0;
                        default:
                            return 0.0;
                    }
                case "Fahrenheit":
                    switch (to) {
                        case "Kelvin":
                            return (input + 459.67) * 5 / 9;
                        case "Celsius":
                            return (input - 32) * 5 / 9;
                        case "Fahrenheit":
                            return input;
                    }
            }
        }
        return 0.0;
    }
}
