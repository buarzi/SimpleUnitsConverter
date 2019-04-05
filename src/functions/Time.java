package functions;

public class Time {
    public static double calculate(double input, String from, String to) {
        if (!from.isEmpty() && !to.isEmpty()) {
            switch (from) {
                case "Second":
                    switch (to) {
                        case "Second":
                            return input;
                        case "Milliseconds":
                            return input * 1000;
                        case "Minute":
                            return input / 60;
                        case "Hour":
                            return input / 3600;
                        default:
                            return 0.0;
                    }
                case "Milliseconds":
                    switch (to) {
                        case "Second":
                            return input / 1000;
                        case "Milliseconds":
                            return input;
                        case "Minute":
                            return input / 60000;
                        case "Hour":
                            return 0.0;
                        default:
                            return 0.0;
                    }
                case "Minute":
                    switch (to) {
                        case "Second":
                            return input * 60;
                        case "Milliseconds":
                            return input / 60000;
                        case "Minute":
                            return input;
                        case "Hour":
                            return input / 60;
                        default:
                            return 0.0;
                    }
                case "Hour":
                    switch (to) {
                        case "Second":
                            return input * 3600;
                        case "Milliseconds":
                            return input * 3600000;
                        case "Minute":
                            return input / 60;
                        case "Hour":
                            return input;
                        default:
                            return 0.0;
                    }
            }
        }
        return 0.0;
    }
}
