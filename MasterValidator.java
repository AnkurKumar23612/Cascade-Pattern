package temp;
import java.util.*;
public class MasterValidator implements Validator{

	ArrayList<Validator> vals;
	
	public MasterValidator(ArrayList<Validator> requiredValidator)
	{
		this.vals=requiredValidator;
	}
	
	public  boolean validate(Address a)
	{

      for(Validator val:vals)
      {
    	  if(!val.validate(a)) {
    		  return false;
    	  }
      }
      
      return true;
	}
}
