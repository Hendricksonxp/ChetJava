import java.util.Iterator;

public class Payroll {
	
	private Employees employees = new Employees();

	public Employee getEmployeeById(String id) {
		return employees.getById(id);
	}

	public void addEmployee(Employee anEmployee) {
		employees.add(anEmployee);
	}

	public int pay(String payDate) {
		return employees.pay(this, payDate);
	}

	public void payEmployee(Employee employee, String payDate) {
		Payment payment = new Payment(payDate, employee.getName(), employee.getId());
		calculateGross(payment, employee);
		calculateNet(payment, employee);
		employee.addPayment(payment);
		
	}

	private void calculateNet(Payment payment, Employee employee) {
		Dollars federalTax = payment.getGrossAmount().times(.25);
		payment.setFederalTax(federalTax);
		
		Dollars net = payment.getGrossAmount().minus(federalTax);
		payment.setNet(net);
		
	}

	private void calculateGross(Payment payment, Employee employee) {
		payment.setGross(employee.getPayRate());
		
	}

}
