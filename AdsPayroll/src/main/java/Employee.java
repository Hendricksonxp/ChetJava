
public class Employee {

	private String id;
	private String name;
	private Dollars thisPayRate;

	public Employee(String id, String name, Dollars payRate) {
		this.id = id;
		this.name = name;
		thisPayRate = payRate;
	}

	public String getName() {
		return name;
	}
	
	public String getGrossPay(){
		return "0.00";
	}

}
