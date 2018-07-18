import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Employee> collection = new ArrayList<Employee>();

	public void add(Employee anEmployee) {
		collection.add(anEmployee);
	}

	public int pay(Payroll payroll, String payDate) {
		int count = 0;
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			payroll.payEmployee(employee, payDate);
			count  ++;		
		}
		return count;
	}

	public Employee getById(String id) {
		Employee result = missingEmployee();
		
		for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();

			if (employee.getId().equals(id)){
				return employee;
			}
		}
		return missingEmployee();
	}
	
	private Employee missingEmployee() {
		Dollars rate = Dollars.parse("0.00");
		return new Employee("0","Missing Employee", rate);
	}

}
