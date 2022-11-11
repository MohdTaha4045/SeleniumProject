package moduleNameTestng;

import org.testng.annotations.Test;

public class GroupExecution 
{
	@Test(groups = "smoke")
	public void loginTest()
	{
	System.out.println("LOGIN SUCCESFULLY");	
	}
	
	@Test(groups = "regression")
	public void searchForTheProductTest()
	{
	System.out.println("PRODUCT FOUND");	
	}
	
	@Test(groups = "regression")
	public void AddToTheKartTest()
	{
		System.out.println("ADDED TO THE KART SUCCESSFULLY");
	}
	
	@Test(groups = "regression")
	public void PaymentTest()
	{
		System.out.println("PAYMENT WAS SUCCESSFUL");
	}
	
	@Test(groups = "smoke")
	public void LogoutTest()
	{
		System.out.println("LOGOUT WAS SUCCESSFUL");
	}


}

