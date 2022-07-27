import java.util.*;
public class FtoC {
    static double fahrenheitToCelsius(double f){
        double c = (f-32)*5/9;
        return c;
    }
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Temperature: ");
            try {
                double f = Double.parseDouble(sc.nextLine());
                System.out.println(f + " degrees Fahrenheit is: " + fahrenheitToCelsius(f) + " degrees Celsius");
            } catch (NumberFormatException e) {
                System.out.println(e + " Input was not a number");
            }
        }
    }
}

