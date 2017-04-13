import java.util.Scanner;

public class DewTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the relative humidity between 0 and 1 : ");
        double RH = in.nextDouble();
        System.out.println("Please enter the actual temperature(in degrees C) : ");
        double T = in.nextDouble();
        DewPointTemperature Td = new DewPointTemperature(RH, T);
        System.out.printf("Dew Point Value is%10.2f\n", Td.getDewPoint());

    }
}
