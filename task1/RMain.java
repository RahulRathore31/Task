package task1;

public class RMain {

	public static void main(String[] args) {
		
		 Rectangle rect = new Rectangle(5, 3);   
	     double area = rect.calculateArea();
	     System.out.println("Area of the rectangle: " + area);
	     double perimeter = rect.calculatePerimeter();
	     System.out.println("Perimeter of the rectangle: " + perimeter);
	}

}
 class Rectangle {
 private double width;
 private double height;
 
  public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }
 
 public double calculateArea() {
     return width * height;
 }
 
     public double calculatePerimeter() {
     return 2 * (width + height);
 }
 
 public double getWidth() {
     return width;
 }
 
 	public double getHeight() {
     return height;
 }
}

