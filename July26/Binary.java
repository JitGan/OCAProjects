import java.util.*;
public class Binary {
     static boolean isBinaryNumber(int N) {
         while (N != 0) {
            if (N% 10 > 1) {
                return false;
            }
            N = N / 10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number:" );
        int N = Integer.parseInt(sc.nextLine());
        System.out.println(isBinaryNumber(N));
    }
}

