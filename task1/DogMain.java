package task1;

public class DogMain {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Black", "Roxy");
	     
	    Dog dog2 = new Dog("Pitbull", "Labrador");
	    System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
	     
	    System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
	     
	    dog1.setName("Tyson");
	    dog1.setBreed("JermenShapherd");
	     
	    System.out.println("\nUpdated Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
	}

}
class Dog {
 private String name;
 private String breed;
 
 public Dog(String name, String breed) {
     this.name = name;
     this.breed = breed;
 }
 
 public void setName(String name) {
     this.name = name;
 }
 
 public void setBreed(String breed) {
     this.breed = breed;
 }
 
 public String getName() {
     return name;
 }
 
  public String getBreed() {
     return breed;
 }
}
