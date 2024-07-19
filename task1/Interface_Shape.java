package task1;

public class Interface_Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle = new Rectangle1(5, 4);
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Circle1 circle = new Circle1(3);
        System.out.println("Circle Area: " + circle.getArea());

        Triangle1 triangle = new Triangle1(4, 3);
        System.out.println("Triangle Area: " + triangle.getArea());
	}

}
interface Shape1 {
    double getArea();
}

class Rectangle1 implements Shape1 {
    private double length;
    private double width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle1 implements Shape1 {
    private double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle1 implements Shape1 {
    private double base;
    private double height;

    Triangle1(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}
