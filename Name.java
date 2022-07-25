import java.util.*;

public class Name {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        System.out.print("Enter name: ");
        String str = name.nextLine();
        System.out.println("Your name is: " + str);
        name.close();
    }
}
