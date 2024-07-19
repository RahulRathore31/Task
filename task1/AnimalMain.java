package task1;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tiger obj = new Tiger();
		obj.sound();
		Lion obj1 = new Lion();
		obj1.sound();

	}

}
abstract class Animal {
	public abstract void sound();
}
class Tiger extends Animal {

	@Override
	public void sound() {
	  System.out.println("The Tiger growls.");
		
	}
	
}
class Lion extends Animal {

	@Override
	public void sound() {
		System.out.println("The Lion roars.");
		
	}
	
}
