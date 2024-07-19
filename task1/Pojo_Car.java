package task1;

public class Pojo_Car {
	private String company_name;
    private String model_name;
    private int year;
    private double mileage;

    public String getCompany_name() { 
    	return company_name; 
    	}
    public void setCompany_name(String company_name) { 
    	this.company_name = company_name; 
    	}

    public String getModel_name() { 
    	return model_name; 
    	}
    public void setModel_name(String model_name) { 
    	this.model_name = model_name; 
    	}

    public int getYear() { 
    	return year; 
    	}

    public void setYear(int year) { 
    	this.year = year; 
    	}

    public double getMileage() { 
    	return mileage; 
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo_Car car = new Pojo_Car();
        car.setCompany_name("Toyota");
        car.setModel_name("Camry");
        car.setYear(2020);
        car.mileage = 25.5; // Directly assigning mileage for demonstration purposes

        System.out.println("Company Name: " + car.getCompany_name());
        System.out.println("Model Name: " + car.getModel_name());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
	}

}
    

  