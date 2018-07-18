import org.joda.money.Money;

public class Payment {

	private String date;
	private String name;
	private String id;
	private Dollars gross;
	private Dollars federalTax;
	private Dollars net;


	public Payment(String dateString, String nameString, String idString) {
		date = dateString;
		name = nameString;
		id = idString;
		
	}


	public void setGross(Dollars amount) {
		gross = amount;
	}

	public Dollars getGrossAmount(){
		return gross;
	}

	public String getGrossPay() {
		return gross.toCleanString();
	}


	public void setFederalTax(Dollars federalTax) {
		this.federalTax = federalTax;
	}
	
	public void setNet(Dollars net){
		this.net = net;
	}


	public String getFederalTax() {	
		return federalTax.toCleanString();
	}


	public String getNetPay() {
		return net.toCleanString();
	}

}
