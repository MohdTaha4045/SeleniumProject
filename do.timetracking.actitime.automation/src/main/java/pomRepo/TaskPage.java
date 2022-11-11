package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	public  TaskPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); //this is use to load @FindBy annotations
	}
	
	
	@FindBy(xpath ="//div[text()='Add New']")
	private WebElement addNewButton;
	

	@FindBy(xpath="//div[text()='Create Customer']") 
	private WebElement createCustomerButton;

	public WebElement getAddNewButton() 
	{ 
		return addNewButton; }
	}

	public WebElement getNewCustomerButton() {

	return newCustomerButton;

	}

	public WebElement getEnterCustomerNameTextField() {
		return enterCustomerNameTextField;
	}

	public WebElement getDescriptionTextField() { 
		return descriptionTextField;
	}

	public WebElement getCreateCustomerButton() { 
		return createCustomerButton;

	public void createCustomerAction(String customerName, String description) (
	{
	addNewButton.click(); 
	newCustomerButton.click();
	enterCustomerNameTextField.sendKeys(customerName); 
	descriptionTextField.sendKeys(description);
	createCustomerButton.click();
	}
]

