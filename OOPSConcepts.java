public class OOPSConcepts {
    public static void main(String[] args) {
        //Square square = new Square(12);
        Plot pt = new Plot(35, 6500);
        Square sq = new Square(35);
        Circle circle = new Circle(3);
        Rect rect = new Rect(3, 5 );
        System.out.println("Side is "+ pt.length +" and Area is "+ pt.area());
        System.out.println("Area of Square " +sq.area());
        System.out.println("Area of Circle " +circle.area());
        System.out.println("Area of Rectangle " +rect.area());

    }
}
    class Shape{
        protected int length;
        protected int width;
        Shape(){
            this.length = 2;
            this.width = 4;
        }
        Shape(int length, int width){
            this.length = length;
            this.width = width;
        }
        double area(){
            return this.length * this.width;
        }
    }
    class Square extends Shape{
        Square(int side){
            super(side,side);
//            this.length = side;
//            this.width = side;
        }
        @Override
        double area(){
            return super.length * super.width;
        }
    }
class Circle extends Shape{
        Circle(int radius){
            super(radius, 0);
        }
    @Override
    double area(){
            return 3.14 * super.length * super.length;
        }
}
class Rect extends Shape {
    Rect(int length, int width) {
        super(length, width);
    }
   @Override
   double area(){
        return super.length * super.width;
    }
}
class Plot extends Square{
    int cost_sqft;
    Plot(int side, int cost_sqft) {
        super(side);
        this.cost_sqft = cost_sqft;
    }
    int costOfLand(){
        return (int) (super.area() * cost_sqft);
    }
}

