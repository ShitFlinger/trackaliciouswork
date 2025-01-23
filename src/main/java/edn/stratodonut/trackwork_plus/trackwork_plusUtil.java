package edn.stratodonut.trackwork_plus;

public class trackwork_plusUtil {
    public static double roundTowardZero(double val) {
        if (val < 0) {
            return Math.ceil(val);
        }
        return Math.floor(val);
    }
}
