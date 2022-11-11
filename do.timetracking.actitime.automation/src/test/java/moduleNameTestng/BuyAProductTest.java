package moduleNameTestng;
import org.testng.annotations.Test;

public class BuyAProductTest 
{
	@Test(priority = 1)
	public void loginTest()
	{
	System.out.println("LOGIN SUCCESFULLY");	
	}
	
	@Test(priority = 2 )
	public void searchForTheProductTest()
	{
	System.out.println("PRODUCT FOUND");	
	}
	
	@Test(dependsOnMethods="searchForTheProductTest")
	public void AddToTheKartTest()
	{
		System.out.println("ADDED TO THE KART SUCCESSFULLY");
	}
	
	@Test(dependsOnMethods="AddToTheKartTest")
	public void PaymentTest()
	{
		System.out.println("PAYMENT WAS SUCCESSFUL");
	}
	
	@Test(priority = 3)
	public void LogoutTest()
	{
		System.out.println("LOGOUT WAS SUCCESSFUL");
	}


}
