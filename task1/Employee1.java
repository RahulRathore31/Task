package task1;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Manager1 manager = new Manager1();
	        Programmer1 programmer = new Programmer1();

	        System.out.println("Manager's Salary: Rs" + manager.calculateSalary());
	        System.out.println("Programmer's Salary: Rs." + programmer.calculateSalary());
	}

}
class Employee2 {
    public double calculateSalary() {
        return 0.0;
    }
}

class Manager1 extends Employee2 {
    @Override
    public double calculateSalary() {
        return 105000.0; 
    }
}

class Programmer1 extends Employee2 {
    @Override
    public double calculateSalary() {
        return 70000.0; 
    }
}
