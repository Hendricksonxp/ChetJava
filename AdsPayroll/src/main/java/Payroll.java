import java.util.Iterator;

public class Payroll {
	
	private Employees employees = new Employees();

	public Employee getEmployeeById(String id) {
		return employees.getById(id);
	}

	public void addEmployee(Employee anEmployee) {
		employees.add(anEmployee);
	}

	public int pay() {
		return employees.pay(this);
	}

	public void payEmployee(Employee employee) {
		Payment payment = new Payment("20180731", employee.getName(), employee.getId());
		calculateGross(payment, employee);
		calculateNet(payment, employee);
		employee.addPayment(payment);
		
	}

	private void calculateNet(Payment payment, Employee employee) {
		// TODO Auto-generated method stub
		
	}

	private void calculateGross(Payment payment, Employee employee) {
		payment.setGross(Dollars.parse("1000.00"));
		
	}

}
