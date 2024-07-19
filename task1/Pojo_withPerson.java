package task1;

public class Pojo_withPerson {
	 private String name;
	    private int age;
	    private String country;

	    public String getName() { 
	    	return name; 
	    	}
	    public void setName(String name) { 
	    	this.name = name; 
	    	}
	    public int getAge() { 
	    	return age; 
	    	}
	    public void setAge(int age) { 
	    	this.age = age; 
	    	}
	    public String getCountry() { 
	    	return country; 
	    	}
	    public void setCountry(String country) { 
	    	this.country = country; 
	    	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pojo_withPerson person = new Pojo_withPerson();
	        person.setName("RAHUL RATHORE");
	        person.setAge(23);
	        person.setCountry("India");

	        System.out.println("Person's name: " + person.getName());
	        System.out.println("Person's age: " + person.getAge());
	        System.out.println("Person's country: " + person.getCountry());

	}

}
