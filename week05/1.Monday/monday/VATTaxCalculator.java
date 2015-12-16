package monday;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class VATTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private List<CountryVatTax> countries=new ArrayList<>();
	
	// default constructor which accept a list of CountryVatTax
	public VATTaxCalculator(List<CountryVatTax> countries){
		this.countries=countries;
	}

	private HashMap <Integer,Double> createHashMap(){
		HashMap<Integer, Double> map=new HashMap<>();
		for(CountryVatTax t:countries){
			map.put(t.getCountryId(), t.getVATTax());
		}
		return map;
		
	}
	//method CalculateTax which should calculate VAT tax on a product price
	public double calculateTax(int code, double price){
		HashMap<Integer, Double> map=createHashMap();
		Set<?> set=map.entrySet();
		Iterator iter= set.iterator();
		while(iter.hasNext()){
			Map.Entry m = (Map.Entry)iter.next();
			if(m.getKey().equals(code)){
				double tax=(double) m.getValue();
				return price* tax;
			}
		}
		return price;
	}
	public double calculateTax(double price){
		
		return price;
		}
	//CalculateTax() method should accept product price and countryId (countryId isn't mandatory so an overload method should be implemented which doesn't accept countryId. In that case the default country tax must be used for calculations)
	//If country isn't supported then an appropriate NotSupportedCountryException should be thrown.
}
