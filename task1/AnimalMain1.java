package task1;

public class AnimalMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion2 L= new Lion2();
		L.eat();
		L.sleep();
		
		Tiger2 T= new Tiger2();
		T.eat();
		T.sleep();
		
		Deer D= new Deer();
		D.eat();
		D.sleep();
	}

}

abstract class Animal2 {
	public abstract void eat();
	public abstract void sleep();
}

class Lion2 extends Animal2 {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lions are carnivores, which means they are eat meat."
				+ " Some of the types of prey they catch include birds, hares, turtles, mice, lizards,"
				+ " wild hogs, wild dogs,"
				+ " antelopes, cheetahs, buffaloes, leopards, crocodiles, baby elephants, rhinoceros, "
				+ "hippopotamuses, and even tall giraffes!");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Lion is sleeping.");
		
	}
	
}

class Tiger2 extends Animal2 {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Tiger are carnivores, which means they are eat meat."
				+ " Some of the types of prey they catch include birds, hares, turtles, mice, lizards,"
				+ " wild hogs, wild dogs,"
				+ " antelopes, cheetahs, buffaloes, leopards, crocodiles, baby elephants, rhinoceros, "
				+ "hippopotamuses, and even tall giraffes!");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is sleeping.");
	}
	
}

class Deer extends Animal2 {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Deer eat a variety of food types, including browse"
				+ " (leafy parts of woody plants), forbs (herbaceous broad-leaved plants, "
				+ "including agricultural crops), hard and soft mast (seeds), grass and "
				+ "mushrooms/lichens.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Deer is sleeping");
	}
	
}
