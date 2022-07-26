import java.util.*;

public class CalApp {
    static double result;


    public CalApp(int num1, int num2) {
    }

    public static int add(int num1, int num2) {
        result = num1 + num2;
        return (int) result;
    }
    public static int subtract(int num1, int num2) {
        result = num1 - num2;
        return (int) result;
    }
    public static int multiply(int num1, int num2) {
        result = num1 * num2;
        return (int) result;
    }
    public static double divide(double num1, double num2) {
        result = num1 / num2;
        return result;
    }
    public static int modulo(int num1, int num2) {
        result = num1 % num2;
        return (int) result;
    }
    public static int or(int num1, int num2) {
        result = num1 | num2;
        return (int) result;
    }
    public static int and(int num1, int num2) {
        result = num1 & num2;
        return (int) result;
    }
    public static int xor(int num1, int num2) {
        result = num1 ^ num2;
        return (int) result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me the first value");
        int num1 = sc.nextInt();
        System.out.println("Tell me the second value");
        int num2 = sc.nextInt();
        System.out.println("What operation is needed: +, -, *, /, %, |, &, ^");
        String op = sc.next();
        switch(op){
            case "+":
                CalApp ans = new CalApp(num1, num2);
                CalApp.add(num1, num2);
                break;
            case "-":
                ans = new CalApp(num1, num2);
                CalApp.subtract(num1, num2);
                break;
            case "*":
                ans = new CalApp(num1, num2);
                CalApp.multiply(num1, num2);
                break;
            case "/":
                ans = new CalApp(num1, num2);
                CalApp.divide(num1, num2);
                break;
            case "%":
                ans = new CalApp(num1, num2);
                CalApp.modulo(num1, num2);
                break;
            case "|":
                ans = new CalApp(num1, num2);
                CalApp.or(num1, num2);
                break;
            case "&":
                ans = new CalApp(num1, num2);
                CalApp.and(num1, num2);
                break;
            case "^":
                ans = new CalApp(num1, num2);
                CalApp.xor(num1, num2);
                break;
            default:
                System.out.println("Invalid Data Type.");
                break;
        }
        sc.close();
        if (result > 0)
            System.out.println(result + " is Positive");

        else if (result < 0)
            System.out.println(result + " is Negative");

        else
            System.out.println("zero");


    }



}


