package temp;
import java.util.*;
public class ValidatorCascadorFactory {

	
	public static HashMap<String,MasterValidator> m;
	
	static ValidatorCascadorFactory firstObject;
	
	private ValidatorCascadorFactory()
	{
		m=new HashMap<>();
		CountryValidator v1=new CountryValidator();
		ZipCodeValidator z1=new ZipCodeValidator();
		m.put("c1", new MasterValidator(new ArrayList<Validator>(){ {
			  add(v1);
			  add(z1);
			  }
		}
		));
		m.put("c2", new MasterValidator(new ArrayList<Validator>(){ {
			  add(z1);
			  }
		}
		));
		m.put("c3", new MasterValidator(new ArrayList<Validator>(){ {
			  add(v1);
			  }
		}
		));
	}
	
	public static ValidatorCascadorFactory getInstance()
	{
		if(firstObject==null)
		{
			firstObject=new ValidatorCascadorFactory();
		}
		
		return firstObject;
	}
	
	public MasterValidator getValidator(String client)
	{
		return m.get(client);
	}
	
}
