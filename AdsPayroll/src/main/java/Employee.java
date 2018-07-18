import java.util.ArrayList;

public class Employee {

	private String id;
	private String name;
	private Dollars payRate;
	private ArrayList payments;

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

	

}
