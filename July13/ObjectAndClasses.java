import java.util.Scanner;

public class ObjectAndClasses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Tell me the first number");
        int input1 = sc.nextInt();
        System.out.println(" Tell me the second number");
        int input2 = sc.nextInt();
// calling the method sum and storing the result in variable result
        int result = sum(input1, input2);
        System.out.println("The sum of the numbers is " + result);
    }

    // why to create methods :- if you are a doing a repetitive task it's unnecessary to write the same functionality again and aging,
// so using method you can write the functionality once and reuse it again and again
// how to create a method
// (int a , int b) are the input parameters and define the skeleton of how the values are passed into the method.
    static int sum(int a, int b){
// calculate and return the value of a+b as the return value of sum method
        return a + b;
    }

// Assignment :- Do the same calculator app using methods ?
// Q2 : do a practical of scope of variable ?
// Q3 : test default values of all the primitive data types ?

}
