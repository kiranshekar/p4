package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo {
static {
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException  {
		//WebDriver driver1=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
         driver.get("http://google.com");
         Thread.sleep(2000);
          driver.quit();
	}

}
