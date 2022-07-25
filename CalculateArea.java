class CalculateArea {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(10, 10);
        Rectangle r1 = new Rectangle(5, 10);
        IsoTriangle tr2 = new IsoTriangle(4, 20);
        Parallelogram pr1 = new Parallelogram(8,9);
        Rhombus rh1 = new Rhombus(5,15);
        EquiTriangle tr3 = new EquiTriangle(6, 5);
        PerimeterofSquare ps1 = new PerimeterofSquare(5);
        volumeOfCylinder vc1 = new volumeOfCylinder(5,3);
        System.out.println("Area of Triangle: " + tr1.area());
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Isosceles Triangle: " + tr2.area());
        System.out.println("Area of Parallelogram: " + pr1.area());
        System.out.println("Area of Rhombus: " + rh1.area());
        System.out.println("Area of Equilateral Triangle: " + tr3.area());
        System.out.println("Perimeter of Square:" + ps1.perimeter());
        System.out.println("Volume of Cylinder:" +vc1.volume());

    }
}
class Triangle{
    protected int base,height;
    Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return (double)(this.base * this.height)/2;
    }
}
class Rectangle {
    int length,width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return (double) length * width;
    }
}
class IsoTriangle extends Triangle{
    IsoTriangle(int base, int height){
        super(base, height);
    }
    @Override
    public double area(){
        return super.area();
    }
}
class Parallelogram{
    protected int base,height;
    Parallelogram(int base, int height){
        this.base = base;
        this.height = height;
    }
    double area(){
        return (double)(this.base * this.height)/2;
    }
}
class Rhombus extends Parallelogram{
    Rhombus(int base, int height){
        super(base, height);
    }
    @Override
    double area(){
        return super.area();
    }
}
class EquiTriangle extends Triangle{
    EquiTriangle(int base, int height) {
        super(base, height);
    }
    @Override
    double area(){
        return super.area();
    }
}
class PerimeterofSquare{
    int side;
    PerimeterofSquare(int side) {
        this.side = side;
    }
    double perimeter() {
        return (double)side*4;
    }
}
class volumeOfCylinder{
    int radius;
    int height;
    double pi = 3.14;
    public volumeOfCylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;

    }
    double volume(){
        return (double) radius*radius*height*pi;
    }
}




















