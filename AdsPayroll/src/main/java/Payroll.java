
public class Payroll {

	public Employee getEmployeeById(String id) {
		Dollars rate = Dollars.parse("0.00");
		return new Employee("0","Missing Employee", rate);
	}

	public void addEmployee(Employee anEmployee) {
		
	}

	public static int pay() {
		return 0;
	}

}
