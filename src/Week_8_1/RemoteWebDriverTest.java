package Week_8_1;

public class RemoteWebDriverTest {

	public static void main(String[] args) {
		
RemoteWebDriver driver=  new FirefoxDriver();

driver.get("https://www.silicone.com");
driver.quit();

driver = new ChromeDriver();

driver.get("https://www.google.com");
driver.quit();

driver = new OperaDriver();
driver.get("https://www.amazon.com");
driver.quit();



	}

}
