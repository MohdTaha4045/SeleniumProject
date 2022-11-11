
package moduleNameTestng;

import org.testng.annotations.Test;

public class SoftAssert//it s used to pass the test cases any how  
{
	@Test()
	public void demo()
	{
		  String expectedResult = "abc";
		 String actualResult = "def";
		
		org.testng.asserts.SoftAssert soft = new org.testng.asserts.SoftAssert();
		soft.assertEquals(actualResult, expectedResult);
		System.out.println("Pass");
		
		soft.assertAll();
	}


}
