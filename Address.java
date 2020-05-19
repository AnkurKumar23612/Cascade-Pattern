package temp;

public class Address {
	//here many type of address but for now  we will only consider zipcode 
	//String city;
	//String country;
	 String country;
	 String zipCode;
	 
	 //can have constructor also
	 //can follow builder pattern also
	 
	 public String getCountry()
	 {
		 return country;
	 }
	 
	 public void setCountry(String country)
	 {
		 this.country=country;
	 }
	 
	 public String getZipCode()
	 {
		 return zipCode;
	 }
	 
	 public void setZipCode(String zip)
	 {
		 this.zipCode=zip;
	 }
	 

}
