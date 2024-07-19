package task1;

public class ABST_Vehicle {

	public static void main(String[] args) {
		 Vehicle car = new Car();
	        car.startEngine();
	        car.stopEngine();

	        Vehicle motorcycle = new Motorcycle();
	        motorcycle.startEngine();
	        motorcycle.stopEngine();
		
	}

}
abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle engine stopped.");
    }
}
