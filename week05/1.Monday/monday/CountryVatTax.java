package monday;

public final class CountryVatTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private int countryId;
	private String name;
	private double VATTax;
	private boolean IsDefault;
	
	public CountryVatTax(int countryId, String name,double VATTax,boolean IsDefault){
		this.countryId=countryId;
		this.name=name;
		this.VATTax=VATTax;
		this.IsDefault=IsDefault;
	}
	public int getCountryId() {
		return countryId;
	}
	public String getName() {
		return name;
	}
	public double getVATTax() {
		return VATTax;
	}
	
	
}
