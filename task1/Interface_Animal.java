package task1;

public class Interface_Animal {

	public static void main(String[] args) {
		
		  Dog1 dog = new Dog1();
	        dog.bark();
	}

}
interface Animal1 {
    void bark();
}

class Dog1 implements Animal1 {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
