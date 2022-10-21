import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuitExample {
	WebDriver driver;
	long startTime;
	long endTime;
	// 1. Open chrome and go to
	// https://www.google.co.in/, https://www.bing.com/, https://in.search.yahoo.com/ the close the browser
	@BeforeSuite
	public void launchChrome() {
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "F:\\Testing\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();

	}
@Test
	public void gotoGoogle() {
		driver.get("https://www.google.co.in/");
	}
@Test
	public void openYahoo() {
		driver.get("https://www.yahoo.co.in/");
	}
@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime=System.currentTimeMillis();
		long totTime=endTime-startTime;
		System.out.println("Total time taken: "+totTime);
	}
}
