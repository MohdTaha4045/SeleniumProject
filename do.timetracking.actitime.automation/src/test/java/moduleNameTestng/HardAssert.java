package moduleNameTestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test()
	public void demo()
	{
		boolean expectedResult = true;
		boolean actualResult = false;
		
		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
	}
	

}
