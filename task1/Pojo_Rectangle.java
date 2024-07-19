package task1;

public class Pojo_Rectangle {
	private double length;
    private double width;

    public double getLength() { 
    	return length; 
    	}
    public void setLength(double length) { 
    	this.length = length; 
    	}
    public double getWidth() { 
    	return width; 
    	}
    public void setWidth(double width) { 
    	this.width = width; 
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Pojo_Rectangle rectangle = new Pojo_Rectangle();
	        rectangle.setLength(5.0);
	        rectangle.setWidth(3.0);

	        System.out.println("Length: " + rectangle.getLength());
	        System.out.println("Width: " + rectangle.getWidth());

	}

}

    

  