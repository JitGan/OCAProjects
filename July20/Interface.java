public class Interface {
    public static void main(String[] args) {

        Shape2 rect = new Square2(2, 3);
        System.out.println("Area of square: " + rect.area());
        Shape2 circle = new Circle2(2);
        System.out.println("Area of circle: " + circle.area());
    }
}
    interface Shape2 {
        void draw();
        double area();
    }
    class Square2 implements Shape2 {
        int len, wid;
        Square2(int len, int wid) {
            this.len = len;
            this.wid = wid;
        }
        @Override
        public void draw() {
            System.out.println("Square has been drawn ");
        }
        @Override public double area()
        {
            return (double)(len * wid);
        }
    }
    class Circle2 implements Shape2 {
        double pii = 3.14;
        int rad;
        Circle2(int rad) { this.rad = rad; }
        @Override
        public void draw() {
            System.out.println("Circle has been drawn ");
        }
        @Override
        public double area() {
            return (double)((pii * rad * rad));
        }
    }


