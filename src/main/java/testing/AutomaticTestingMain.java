package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomaticTestingMain {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\snwag\\OneDrive\\Desktop\\Java\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement we = driver.findElement(By.id("ap_email"));
		we.sendKeys("+919325278195");
		
		WebElement we1 = driver.findElement(By.id("ap_password"));
		we1.sendKeys("shweta@10k");
		
		WebElement we2 = driver.findElement(By.id("signInSubmit"));
		we2.click();
		
		
		
		
//		
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\snwag\\OneDrive\\Desktop\\Java\\EdgeDriver\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.google.com/");
//		driver.get("https://www.amazon.in/ref=nav_logo");
	}

}
