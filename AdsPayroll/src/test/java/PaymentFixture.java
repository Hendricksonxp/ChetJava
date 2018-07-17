
public class PaymentFixture {
	
	private String id;
	private String name;
	private String payRate;
	private Payroll thePayroll;
	private Employee currentEmployee;
	
	public void id(String aString){
		id = aString;
	}
	
	public void name(String aString){
		name = aString;
	}
	
	public void payRate(String aString){
		payRate = aString;
	}
	
	public String name(){
		currentEmployee = thePayroll.getEmployeeById(id);
		return currentEmployee.getName();
	}
	
	public boolean add(){
		Employee anEmployee = new Employee(id, name, Dollars.parse(payRate));
		thePayroll.addEmployee(anEmployee);
		return true;
	}
	
	public int pay(){
		return Payroll.pay();
	}
	
	public String grossPay(){
		return currentEmployee.getGrossPay();
	}

}
