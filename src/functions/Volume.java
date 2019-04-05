package functions;

public class Volume {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "Liter":
                    switch (to) {
                        case "Liter":
                            return input;
                        case "Milliliter":
                            return input / 0.001;
                        case "US Gallon":
                            return input * 0.26417;
                        case "US Pint":
                            return input * 2.1134;
                        default:
                            return 0.0;
                    }
                case "Milliliter":
                    switch (to) {
                        case "Liter":
                            return input / 1000;
                        case "Milliliter":
                            return input;
                        case "US Gallon":
                            return input * 0.00026417;
                        case "US Pint":
                            return input * 0.0021134;
                        default:
                            return 0.0;
                    }
                case "US Gallon":
                    switch (to) {
                        case "Liter":
                            return input / 0.26417;
                        case "Milliliter":
                            return input / 0.00026417;
                        case "US Gallon":
                            return input;
                        case "US Pint":
                            return input * 8;
                        default:
                            return 0.0;
                    }
                case "US Pint":
                    switch (to) {
                        case "Liter":
                            return input / 2.1134;
                        case "Milliliter":
                            return input / 0.0021134;
                        case "US Gallon":
                            return input * 0.10742;
                        case "US Pint":
                            return input;
                        default:
                            return 0.0;
                    }
            }
        }
        return 0.0;
    }
}
