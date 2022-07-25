public class Patterns {
    public static void main(String[] args) {
       Fibonacci f10 = new Fibonacci();
       SumofN sum10 = new SumofN();
       StarPattern sp1 = new StarPattern();
       rightTriangle rt = new rightTriangle();
       f10.sequence(10);
       sum10.sum(10);
       sp1.square(5);
       rt.pattern(5);
       System.out.println("");
       rt.reverse(5);
       System.out.println("");
       sp1.pyramid(5);
       System.out.println("");
       sp1.pyramidWithSpace(5);


    }
}
class Fibonacci{
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        void sequence(int N){
        while (counter < N) {
        System.out.println(num1 + " ");
        int num3 = num2 + num1;
        num1 = num2;
        num2 = num3;
        counter = counter+1;
        }
        }
    }
class SumofN {
    int i;
    int sum = 0;
    void sum(int n) {
        for (i = 1; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
class rightTriangle{
void pattern(int x) {
        int i, j;
        for(i=0; i<x; i++){
        
        for(j=0; j<=i; j++){

        System.out.print("* ");
    }
     System.out.println();
 }
}
void reverse (int x){
    int i,j;
    for( i=x;  i>0; i--){
        for( j=0; j<i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
class StarPattern {
    void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= x - 1; i++) {
            for (int j = x - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pyramidWithSpace(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= x - 1; i++) {
            for (int j = x - 1; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

