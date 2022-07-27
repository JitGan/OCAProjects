import java.util.Scanner;
public class Strings {
    // Assignment
// Q1. Implement reverse of the string using string and string builder without using any methods from the classes;
// (Hint :- to add anything to a string builder you use s.append("") to add it to the end of the value and insert() to insert any string at a position)
// Q2. Check for Palindrome numbers in the input and do the same for strings ?
// Q3. In "Hoeololo Worolod" replace all "o" with '-' using string and String Builder ?
// Q4. Create an app to convert temperature from F to C which takes String Input and do the proper exception handling for the same ? (should look good on console)
    // Q5. Do a AND operation on two Binary values represented in a String. Check if the value is proper binary value or not i.e. 1s and 0s only allowed; (you can use String or StringBuilder)
// Hint :- 100010101
//     AND 111010101
//         100010101 == res do not use operators or conversions everything has been done in String or StringBuilder
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


public static void main(String[] args) {
    String s;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    s=sc.nextLine();
    System.out.print("After reverse string is: ");
    int i=s.length();
    while(i>0) {
        System.out.print(s.charAt(i-1));
        i--;
    }
    System.out.println();
    Scanner sc2 =new Scanner(System.in);
    System.out.print("Enter String:");
    String str = sc2.nextLine();
    System.out.println(str+" is a Palindrome: "+isPalindrome(str));

    System.out.println();
    String s1="Hoeololo Worolod";
    String replaceString=s1.replace("o","-");
    System.out.println(replaceString);

}
}







