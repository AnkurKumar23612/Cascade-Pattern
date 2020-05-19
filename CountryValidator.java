package temp;



public class CountryValidator implements Validator{
	
	public  boolean validate(Address a)
	{
		return ResourceInitializer.getInstance().country.containsKey(a.country);
	}

}
