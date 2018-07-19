import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	private String id;
	private String name;
	private Dollars payRate;
	private ArrayList<Payment> payments;

	public Employee(String id, String name, Dollars payRate) {
		this.id = id;
		this.name = name;
		this.payRate = payRate;
		payments = new ArrayList<Payment>();
	}

	public String getName() {
		return name;
	}
	
	public String getGrossPay(){
		Payment currentPayment = (Payment) payments.get(payments.size() - 1);
		return currentPayment.getGrossPay();
	}

	public String getId() {
		return id;
	}

	public void addPayment(Payment payment) {
		payments.add(payment);
	}

	public Dollars getPayRate() {
		return payRate;
	}

	public String getFederalTax() {
		Payment currentPayment = (Payment) payments.get(payments.size() - 1);
		return currentPayment.getFederalTax();
	}

	public String getNetPay() {
		Payment currentPayment = (Payment) payments.get(payments.size() - 1);
		return currentPayment.getNetPay();
	}

	public String getQtdGrossPay() {
		ArrayList qtdPayments = paymentsForQuarter();
		Dollars result = Dollars.parse("0.00");
		
		for (Iterator iterator = qtdPayments.iterator(); iterator.hasNext();) {
			Payment each = (Payment) iterator.next();
			result = result.plus(each.getGrossAmount());	
		}		
		return result.toCleanString();
	}

	private ArrayList paymentsForQuarter() {
		ArrayList result = new ArrayList();
		String currentQuarter = currentQuarter();
		for (Iterator iterator = payments.iterator(); iterator.hasNext();) {
			Payment each = (Payment) iterator.next();
			if (each.isForQuarter(currentQuarter)) {
				result.add(each);
			}
			
		}
		
		return result;
	}

	private String currentQuarter() {
		Payment currentPayment = (Payment) payments.get(payments.size() - 1);
		return currentPayment.getPayDate().substring(4,6);
		
	}

	

}
