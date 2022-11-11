package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this is use to load @FindBy annotations
	}
	
	@FindBy(id="container_tasks")
	private WebElement taskButton;
	
	@FindBy(id="logoutLink")
	private WebElement LogoutButton;

	public WebElement getTaskButton() {
		return taskButton;
	}

	public WebElement getLogoutButton() {
		return LogoutButton;
	}

	public void clickOnTaskButton()
	{
		
		taskButton.click();
	}
	public void logoutAction()
	{
		
		LogoutButton.click();
	}
}
