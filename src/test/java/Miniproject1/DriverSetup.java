package Miniproject1;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	//import org.openqa.selenium.firefox.FirefoxDriver;

	//import io.github.bonigarcia.wdm.WebDriverManager;

	public class DriverSetup {
		static WebDriver driver;
		public static WebDriver getDriver() {
			// TODO Auto-generated method stub
			String browser = "edge";
			if(browser.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else {
				System.out.println("incorrect browser");
			}
			return driver;
		}
	}

