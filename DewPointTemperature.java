public class DewPointTemperature {

    private static final double a = 17.27;
    private static final double b = 237.7;
    public double T;
    public double RH;

    public DewPointTemperature(double rh, double t) {
        RH = rh;
        T = t;
    }

    public double getDewPoint() {

        double f = ((a * T) / (b + T)) + Math.log(RH);
        return (b * f) / (a - f);
    }

}
