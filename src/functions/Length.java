package functions;

public class Length {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "Meter":
                    switch (to) {
                        case "Meter":
                            return input;
                        case "Kilometer":
                            return input / 1000;
                        case "Centimeter":
                            return input * 100;
                        case "Mile":
                            return input / 1609.344;
                        case "Yard":
                            return input * 1.0936;
                        case "Foot":
                            return input * 3.2808;
                        case "Inch":
                            return input * 39.370;
                        default:
                            return 0.0;
                    }
                case "Kilometer":
                    switch (to) {
                        case "Meter":
                            return input * 1000;
                        case "Kilometer":
                            return input;
                        case "Centimeter":
                            return input * 100000;
                        case "Mile":
                            return input * 0.62137;
                        case "Yard":
                            return input * 1.0936;
                        case "Foot":
                            return input * 3.2808;
                        case "Inch":
                            return input * 39.370;
                        default:
                            return 0.0;
                    }
                case "Centimeter":
                    switch (to) {
                        case "Meter":
                            return input / 100;
                        case "Kilometer":
                            return input / 100000;
                        case "Centimeter":
                            return input;
                        case "Mile":
                            return input * 0.0000062137;
                        case "Yard":
                            return input * 0.010936;
                        case "Foot":
                            return input * 0.032808;
                        case "Inch":
                            return input * 0.39370;
                        default:
                            return 0.0;
                    }
                case "Mile":
                    switch (to) {
                        case "Meter":
                            return input / 0.00062137;
                        case "Kilometer":
                            return input / 0.62137;
                        case "Centimeter":
                            return input / 0.0000062137;
                        case "Mile":
                            return input;
                        case "Yard":
                            return input * 1760.0;
                        case "Foot":
                            return input * 5280.0;
                        case "Inch":
                            return input * 63360;
                        default:
                            return 0.0;
                    }
                case "Yard":
                    switch (to) {
                        case "Meter":
                            return input / 1.0936;
                        case "Kilometer":
                            return input / 1093.6;
                        case "Centimeter":
                            return input / 0.010936;
                        case "Mile":
                            return input * 0.00056818;
                        case "Yard":
                            return input;
                        case "Foot":
                            return input * 3;
                        case "Inch":
                            return input * 36;
                        default:
                            return 0.0;
                    }
                case "Foot":
                    switch (to) {
                        case "Meter":
                            return input / 3.2808;
                        case "Kilometer":
                            return input / 3280.8;
                        case "Centimeter":
                            return input / 0.032808;
                        case "Mile":
                            return input * 0.00018939;
                        case "Yard":
                            return input * 0.33333;
                        case "Foot":
                            return input;
                        case "Inch":
                            return input * 12;
                        default:
                            return 0.0;
                    }
                case "Inch":
                    switch (to) {
                        case "Meter":
                            return input / 39.370;
                        case "Kilometer":
                            return input / 39370;
                        case "Centimeter":
                            return input / 0.39370;
                        case "Mile":
                            return input * 0.000015783;
                        case "Yard":
                            return input * 0.027778;
                        case "Foot":
                            return input / 12;
                        case "Inch":
                            return input;
                        default:
                            return 0.0;
                    }
            }
        }
        return 0.0;
    }
}
