package task1;

public class ABST_Employee {

	public static void main(String[] args) {
		Manager manager = new Manager("Rahul Rathore", 5000, 1500);
        manager.displayInfo();

        System.out.println();

        Programmer programmer = new Programmer("Rakesh Chouhan", 4000, 10, 20);
        programmer.displayInfo();

	}

}
abstract class Employee {
    abstract double calculateSalary();
    abstract void displayInfo();
}

class Manager extends Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    private String name;
    private double baseSalary;
    private int overtimeHours;
    private double ratePerHour;

    Programmer(String name, double baseSalary, int overtimeHours, double ratePerHour) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    double calculateSalary() {
        return baseSalary + (overtimeHours * ratePerHour);
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Overtime Hours: " + overtimeHours);
        System.out.println("Rate per Hour: " + ratePerHour);
        System.out.println("Total Salary: " + calculateSalary());
    }
}
