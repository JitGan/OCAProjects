import java.util.*;

interface sweetShop {
    String name = null;
    int cal=0;
    void getCost();
}
public class demo {
    public static void main(String[] args) {
        sweetShop cookie = new sweetShop() {
            @Override
            public void getCost() {
                String name = "cookie";
                int cal = 100;
                Random num = new Random();
                int val = num.nextInt(10);
                double cost = name.length() * val + cal;
                System.out.println("Cost of a "+name+ ": $" + cost);
            }
        };
        cookie.getCost();
        sweetShop cake = new sweetShop() {
            @Override
            public void getCost() {
                String name = "cake";
                int cal = 200;
                Random num = new Random();
                int val = num.nextInt(10);
                double cost = name.length() * val + cal;
                System.out.println("Cost of a "+name+ ": $" + cost);

            }
        };
        cake.getCost();
        //Lambda
        sweetShop candy = () ->{
            String name = "candy";
            int cal = 50;
            Random num = new Random();
            int val = num.nextInt(10);
            double cost = name.length() * val+ cal;
            System.out.println("Cost of a "+name+ ": $" + cost);
        };
        sweetShop chocolate = () ->{
            String name = "chocolate";
            int cal = 50;
            Random num = new Random();
            int val = num.nextInt(10);
            double cost = name.length() * val + cal;
            System.out.println("Cost of a "+name+ ": $" + cost);
        };
        candy.getCost();
        chocolate.getCost();

    }
}
