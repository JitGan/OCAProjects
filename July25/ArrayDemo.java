import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

    }
}
class Diamond{
    public static void main(String[] args) {
        int n, i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1;
        for ( j = 1; j<= n; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= n - 1; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (n - j) - 1; i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

class AL{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(15);
        list.add(25);
        list.add(13);
        Iterator<Integer> it = list.iterator();
        System.out.println("The values in the list are:");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }




    }
}







