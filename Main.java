package temp;
 
public class Main {

	public static void main(String[] args) {
		//here both country and zipcode are right
		
		//now 3 type of client c1 and c2
		//c1 needs both type of validator
		//country validator which in this case we will only consider Indiavalidator and zipcode validator
		//and c2 only needs zipcode validator
		//c3 needs only country validator
		boolean ans;
		Address a=new Address();
		a.setCountry("in");
		a.setZipCode("123");
		System.out.println("first");
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c1").validate(a);
		System.out.println(ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c2").validate(a);
		System.out.println(ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c3").validate(a);
		System.out.println(ans);
		
		
		
		
		
		
		
		
		//here  country is  right, but zipcode is not right
        Address a1=new Address();
		a1.setCountry("in");
		a1.setZipCode("1234");
		System.out.println("second");
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c1").validate(a1);
		System.out.println("c1"+" "+ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c2").validate(a1);
		System.out.println("c2"+" "+ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c3").validate(a1);
		System.out.println("c3"+" "+ans);
		
		
		
		
		//here zipcode is not right
		Address a2=new Address();
		a2.setCountry("ind");
		a2.setZipCode("223");
		System.out.println("third");
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c1").validate(a2);
		System.out.println("c1"+" "+ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c2").validate(a2);
		System.out.println("c2"+" "+ans);
		ans=	ValidatorCascadorFactory.getInstance().getValidator("c3").validate(a2);
		System.out.println("c3"+" "+ans);
	}

}
