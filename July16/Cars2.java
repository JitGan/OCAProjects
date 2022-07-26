public class Cars2 {
    public static void main(String[] args) {
    Bugatti bugatti = new Bugatti(100 , "black","AWD", 175, 79, "V16",
            "bugatti", 100000, 2000, "Veron");
        System.out.println("$"+bugatti.onRoadCost());
        System.out.println("$"+bugatti.maintenance());
        Honda honda = new Honda(100 , "black","AWD", 175, 79, "V16",
                "bugatti", 100000, 2000, "S2000");
        Nissan nissan = new Nissan(100 , "black","AWD", 175, 79, "V16",
                "bugatti", 100000, 2000, "R34");
        System.out.println("$"+honda.onRoadCost());
        System.out.println("$"+honda.maintenance());
        System.out.println("$"+nissan.onRoadCost());
        System.out.println("$"+nissan.maintenance());
    }
} 

class cars{
    protected int wheelbase;
    protected String color;
    protected String drivetrain;
    protected int length;
    protected int breadth;
    protected String engineType;

    cars(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType){
        this.wheelbase = wheelbase;
        this.color = color;
        this.drivetrain = drivetrain;
        this.length = length;
        this.breadth = breadth;
        this.engineType = engineType;
    }
}
class feature extends cars{

    boolean heatedSeats;
    String soundSystem;
    feature(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType,
            boolean heatedSeats, String soundSystem) {
        super(wheelbase, color, drivetrain, length, breadth, engineType);
        this.heatedSeats = heatedSeats;
        this.soundSystem = soundSystem;
    }

}
class metadata extends cars{

    String manufacturerName;
    int cost;
    int tax;
    metadata(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType,
             String manufacturerName, int cost, int tax) {
        super(wheelbase, color, drivetrain, length, breadth, engineType);
        this.cost = cost;
        this.manufacturerName = manufacturerName;
        this.tax = tax;
    }

}

class prop extends metadata{


    prop(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType,
         String manufacturerName, int cost, int tax) {
        super(wheelbase, color, drivetrain, length, breadth, engineType, manufacturerName, cost, tax);
    }


    double onRoadCost(){
    return super.cost * super.tax + 1000 +2000;
    }

    double maintenance(){
        return (0.1 * super.cost) * (1+0.18);

    }
}
class Bugatti extends prop{

    String carName;

    Bugatti(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType, String manufacturerName, int cost, int tax, String carName) {
        super(wheelbase, color, drivetrain, length, breadth, engineType, manufacturerName, cost, tax);
        this.carName = carName;
    }
   @Override
    double onRoadCost(){
        return (super.cost * super.tax + 1000 +2000)*(1.79);
    }
    double maintenance(){
        return ((0.1 * super.cost) * (1+0.18))* 2.67;
    }


}
class Honda extends prop{

    String carName;
    Honda(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType, String manufacturerName, int cost, int tax, String carName) {
        super(wheelbase, color, drivetrain, length, breadth, engineType, manufacturerName, cost, tax);
        this.carName = carName;
    }
}
class Nissan extends prop{

    String carName;
    Nissan(int wheelbase, String color, String drivetrain, int length, int breadth, String engineType, String manufacturerName, int cost, int tax, String carName) {
        super(wheelbase, color, drivetrain, length, breadth, engineType, manufacturerName, cost, tax);
        this.carName = carName;
    }
}

