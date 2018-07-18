import org.joda.money.Money;

public class Payment {

	private String date;
	private String name;
	private String id;
	private Dollars gross;


	public Payment(String dateString, String nameString, String idString) {
		date = dateString;
		name = nameString;
		id = idString;
		
	}


	public void setGross(Dollars amount) {
		gross = amount;
	}


	public String getGrossPay() {
		return gross.toCleanString();
	}

}
