
public class PaymentFixture {
	
	private String id;
	private String name;
	private String payRate;
	private static Payroll thePayroll = new Payroll();
	private Employee currentEmployee;
	private String payDate;
	
	public void setId(String aString){
		id = aString;
	}
	
	public void setPayDate(String aString){
		payDate = aString;
	}
	
	public void setName(String aString){
		name = aString;
	}
	
	public void setPayRate(String aString){
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
		return thePayroll.pay(payDate);
	}
	
	public String grossPay(){
		return currentEmployee.getGrossPay();
	}
	
	public String federalTax() {
		return currentEmployee.getFederalTax();
	}
	
	public String netPay() {
		return currentEmployee.getNetPay();
	}
	
	public String ytdGrossPay(){
		return "0.00";
	}
	
	public String qtdGrossPay(){
		return currentEmployee.getQtdGrossPay();
	}
}
