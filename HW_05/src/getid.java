import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getid {
	static WebDriver driver=null;
	public static String method(String name) {		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		driver = new ChromeDriver();
		
		String baseUrl = "http://118.178.137.170:8080/";
		driver.get(baseUrl);
		
		driver.findElement(By.name("username")).sendKeys(name);
	    driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();

	    return driver.findElement(By.cssSelector("td:nth-child(3)")).getText();
	    
	    
	}

}
