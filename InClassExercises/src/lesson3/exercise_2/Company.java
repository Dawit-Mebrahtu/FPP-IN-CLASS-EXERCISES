package lesson3.exercise_2;

public class Company {
	private String address;
	private Employee president;
	private int numEmployees;
	
	public Company(String addr, Employee pres, int num) {
		address = addr;
		president = pres;
		numEmployees = num;
	}
	public String getAddress() {
		return address;
	}
	public Employee getPresident() {
		//one way to protect returning mutalbe object
		//second way is to remove setter methods in the class of the object you returning 
		Employee temp = new Employee(president.getName(), president.getSalary());
		return temp;
		
		//return president;
	}
	public int getNumEmployees() {
		return numEmployees;
	}
}


