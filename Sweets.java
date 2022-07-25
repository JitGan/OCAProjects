/*
Assignemt

Q1 . Implement and anonymous class with interfaces of a sweetshop containing parameters like cost , name of the sweet
and calories wherein all different kind of sweets should have different mechanism to calculate the
Cost = length of the name of the sweet * (your own random value based on sweet name) + calories of the sweet ?

Q2. Implement a functional interface for the same question as Q1 and override the functionality using anonymous class ?

Q3. Implement the same question as Q1 using Lambda ?

Q4. Create a program which throws an exception and do a proper handling of those exceptions in your program ?



interface sweetShop{
    String name = null;
    int calories = 0;
    void getCost(String name, int calories, int quant);

}

public class Sweets {
    public static void main(String[] args) {
        sweetShop sweets = new sweetShop(){
            @Override
            public void getCost(String name, int calories, int quant) {

                double cost =  name.length()*quant + calories;
                System.out.println("Cost of a "+name+" is: $" +cost);
            }
        };
        sweets.getCost("cookie",100, 10);
        sweets.getCost("birthday cake", 1000, 1);


        sweetShop sweets2 = (name, calories, quant) -> {
            double cost =  name.length() * quant + calories;
            System.out.println("Cost of a "+name+" is: $" +cost);
        };
        sweets2.getCost("ice cream",150, 3);
        sweets2.getCost("candy", 30, 5);

    }
}

*/
