package functions;

public class Weight {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "Kilogram":
                    switch (to) {
                        case "Kilogram":
                            return input;
                        case "Gram":
                            return input / 0.0010000;
                        case "Miligram":
                            return input / 0.000001;
                        case "Pound":
                            return input * 2.2046;
                        case "Ounce":
                            return input * 35.274;
                        default:
                            return 0.0;
                    }
                case "Gram":
                    switch (to) {
                        case "Kilogram":
                            return input / 1000;
                        case "Gram":
                            return input;
                        case "Miligram":
                            return input / 0.001;
                        case "Pound":
                            return input * 0.0022046;
                        case "Ounce":
                            return input * 0.035274;
                        default:
                            return 0.0;
                    }
                case "Miligram":
                    switch (to) {
                        case "Kilogram":
                            return input / 1000000;
                        case "Gram":
                            return input / 1000;
                        case "Miligram":
                            return input;
                        case "Pound":
                            return input * 0.0000022046;
                        case "Ounce":
                            return input * 0.000035274;
                        default:
                            return 0.0;
                    }
                case "Pound":
                    switch (to) {
                        case "Kilogram":
                            return input / 2.2046;
                        case "Gram":
                            return input / 0.0022046;
                        case "Miligram":
                            return input / 0.0000022046;
                        case "Pound":
                            return input;
                        case "Ounce":
                            return input * 16;
                        default:
                            return 0.0;
                    }
                case "Ounce":
                    switch (to) {
                        case "Kilogram":
                            return input / 35.274;
                        case "Gram":
                            return input / 0.035274;
                        case "Miligram":
                            return input / 0.000035274;
                        case "Pound":
                            return input / 16;
                        case "Ounce":
                            return input;
                        default:
                            return 0.0;
                    }
            }
        }
        return 0.0;
    }
}
