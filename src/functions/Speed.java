package functions;

public class Speed {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "m/s":
                    switch (to) {
                        case "m/s":
                            return input;
                        case "km/h":
                            return input * 3.6;
                        case "mph":
                            return input / 0.44704;
                        default:
                            return 0.0;
                    }
                case "km/h":
                    switch (to) {
                        case "m/s":
                            return input / 3.6;
                        case "km/h":
                            return input;
                        case "mph":
                            return input / 1.609344;
                        default:
                            return 0.0;
                    }
                case "mph":
                    switch (to) {
                        case "m/s":
                            return input / 0.44704;
                        case "km/h":
                            return input * 1.609344;
                        case "mph":
                            return input;
                        default:
                            return 0.0;
                    }
            }
        }
        return 0.0;
    }
}
