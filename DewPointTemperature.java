public class DewPointTemperature {
/*
*we declare a variable (a,b) we put it final so that we could not chang its value
*we declare two double variable (T,RH) with type public to use them inside this class
*/
    private static final double a = 17.27;
    private static final double b = 237.7;
    public double T;
    public double RH;
    /*
    *we make a costractor with the same name of the class to allow us to make objects from it in another class contain a main method
    *this constractor take two parameter
    */
    public DewPointTemperature(double rh, double t) {
        RH = rh;
        T = t;
    }
    //a method called getDewPoint (type: double, means that it returns a double value)
    public double getDewPoint() {
        //this equation to mesure the dew point temperature
        double f = ((a * T) / (b + T)) + Math.log(RH);
        return (b * f) / (a - f);
    }

}
