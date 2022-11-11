package TaskTest;

import org.testng.annotations.Test;

import genericUtility.ExcelUtility;

public class CreateCustomerTest extends BaseClass 
{

	@Test

	Run | Debug

	public void createCustomerAndVerifyCustomerNameTest() throws 
	{
	ExcelUtility eUtils = new ExcelUtility();

	String expectedCustomerName = eUtils.fetchDataFromExcelSheet("Sheet2", 1, 0); String description - eUtils.fetchDataFromExcelSheet ("Sheet2", 1, 1);

	HomePage home = new HomePage (driver); home.clickOnTaskButton();

	TaskPage task = new TaskPage (driver);

	task.createCustomerAction(expectedCustomerName, description);

	CustomerDetailsPage customer = new CustomerDetailsPage (driver);

	String actualCustomerName=customer.verifyCustomerName (expectedCustomerName);

	Assert.assertEquals(actualCustomerName, expectedCustomerName); System.out.println("Pass: Customer Name has been Verified");

	}
}
