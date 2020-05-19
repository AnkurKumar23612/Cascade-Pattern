package temp;

public class ZipCodeValidator implements Validator {

	
	 public boolean validate(Address a)
	 {
		 
		 return ResourceInitializer.getInstance().zipCode.containsKey(a.zipCode);
	 }
}
