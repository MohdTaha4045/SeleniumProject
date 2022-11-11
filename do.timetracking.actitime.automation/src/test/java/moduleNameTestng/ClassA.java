package moduleNameTestng;

import org.testng.annotations.Test;


public class ClassA 
{
	@Test( invocationCount = 5)//it will run 5 times
	public void demo1()
	{
	System.out.println("From Demo1");	
	}
	
	@Test(enabled = false)//it will hide(disable) the method
	public void demo2()
	{

	System.out.println("From Demo2");	
	}
	

	@Test(priority = 1)//it set priority
	public void demo3()
	{
	System.out.println("From Demo3");	
	}
}
