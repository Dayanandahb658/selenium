package Testing;

import org.testng.annotations.Test;

public class Shipment 
{
	static String trackingnumber = null;

	@Test
  public void create()
  {
	  System.out.println("create");
	  trackingnumber="Ab111";
  }
	@Test(dependsOnMethods = {"create"})
	  public void Track() throws Exception
	  {
		if(trackingnumber !=null)
		  System.out.println("Track");
		else
			throw new Exception("invalid trackng number");
			
	  }
	@Test
	  public void cancel() throws Exception
	  {
		if(trackingnumber !=null)
			  System.out.println("cancel");
		  	else
				throw new Exception("invalid trackng number");
	  }
}
