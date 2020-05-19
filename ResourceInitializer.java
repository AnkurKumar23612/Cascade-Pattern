package temp;
import java.util.*;
public class ResourceInitializer {
	
	static HashMap<String,Boolean> zipCode;
	static HashMap<String,Boolean> country;
	static ResourceInitializer r;
	
	private  ResourceInitializer()
	{
		//create connection
		//db-query
		//initialize
		zipCode=new HashMap<>();
		zipCode.put("123", true);
		zipCode.put("223", true);
		
		country=new HashMap<>();
		country.put("in", true);
		
	}
	
	public static ResourceInitializer getInstance()
	{
		if(r==null)
		{
			r=new ResourceInitializer(); 
		}
		return r;
	}

}
