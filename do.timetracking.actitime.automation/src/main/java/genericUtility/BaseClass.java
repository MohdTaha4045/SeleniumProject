package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomRepo.HomePage;
import pomRepo.LoginPage;

public class BaseClass 
{
	WebDriver driver;
	FileUtility fUtils =  new FileUtility();

	@BeforeSuite
	public void bsConfig() 
	{
	System.out.println("Data Base Connection Has Been Established");
	}
	@BeforeClass
	public void bcConfig() {

	String url = fUtils.fetchDataFromPropertyFile("url");
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();

	System.out.println("The Browser Has been Launched"); driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.get(url);

	}

	@BeforeMethod

	public void bmConfig() throws IOException {

	String username = fUtils.fetchDataFromPropertyFile("username"); 
	String password = fUtils.fetchDataFromPropertyFile("password");

	LoginPage login = new LoginPage(driver);

	login.loginAction(username, password);

	System.out.println("Login is Successful");

	}

	@AfterMethod
	public void amConfig() 
	{
	HomePage home = new HomePage (driver); 
	home.logoutAction();
	}
	
	@AfterClass
	public void acConfig() 
	{
	driver.quit();
	} 
	
	@AfterSuite
	public void asConfig() 
	{
	System.out.println("Data Base Connection Has Been Closed");
	}

}
