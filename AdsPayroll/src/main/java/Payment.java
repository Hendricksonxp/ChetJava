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


	public String getPayDate() {
		return date;
	}


	public String quarter() {
		String month = date.substring(4,6);
		
		if (month.equals("01"))return "1";
		if (month.equals("02")) return "1";
		if (month.equals("03")) return "1";
		if (month.equals("04")) return "2";
		if (month.equals("05")) return "2";
		if (month.equals("06")) return "2";
		if (month.equals("07")) return "3";
		if (month.equals("08")) return "3";
		if (month.equals("09")) return "3";
		if (month.equals("10")) return "4";
		if (month.equals("11")) return "4";
		if (month.equals("12")) return "4";
		
		return "0";
	}


	public boolean isForQuarter(String currentQuarter) {		
		return quarter().contentEquals(currentQuarter);
	}


	
}
