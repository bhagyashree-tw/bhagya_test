package bhagya_test_browserstack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonLogin {
	
	public static final String USERNAME = "bhagyashreerai_G2WIem";
	public static final String AUTOMATE_KEY = "3ANzzX4ZHm3s2LHfBKDU";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	MutableCapabilities capabilities = new MutableCapabilities();
	capabilities.setCapability("browserName", "Chrome");
	capabilities.setCapability("browserVersion", "latest");
	HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
	browserstackOptions.put("os", "Windows");
	browserstackOptions.put("osVersion", "11");
	browserstackOptions.put("projectName", "Sample sandbox project");
	browserstackOptions.put("buildName", "Build #1");
	browserstackOptions.put("sessionName", "My First Test");
	capabilities.setCapability("bstack:options", browserstackOptions);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
	driver.get("https://www.amazon.in/");
	WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
	accountList.click();
	WebElement emailorPhone = driver.findElement(By.id("ap_email"));
	emailorPhone.sendKeys("raibhagya2020@gmail.com");
	WebElement continueButton = driver.findElement(By.id("continue"));
	continueButton.click();
	WebElement password = driver.findElement(By.id("ap_password"));
	password.sendKeys("Bh@gy@shreer@i@5497");
	WebElement signInButton = driver.findElement(By.id("signInButton"));
	signInButton.click();
	String url = driver.getCurrentUrl();
	if(url.equals("https://www.amazon.in/gp/yourstore/home?path=%2Fgp%2Fyourstore%2Fhome&useRedirectOnSuccess=1&signIn=1&action=sign-out&ref_=nav_AccountFlyout_signout"))
	{
		System.out.println("Test case passed");
		
	}else
	{
		System.out.println("Test case failed");
		
	}
	
	

	}

}
