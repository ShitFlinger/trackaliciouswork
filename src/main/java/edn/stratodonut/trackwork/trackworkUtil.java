package edn.stratodonut.trackwork;

public class trackworkUtil {
    public static double roundTowardZero(double val) {
        if (val < 0) {
            return Math.ceil(val);
        }
        return Math.floor(val);
    }
}
