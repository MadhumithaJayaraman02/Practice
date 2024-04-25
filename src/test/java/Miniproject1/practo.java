package Miniproject1;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practo {
	public static void main(String[] args) {

	
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.practo.com");
 String title = driver.getTitle();
 if(title.contains("Practo")) {
	 System.out.println("yes");
 }
 else {
	 System.out.println("no");
 }
 
Actions a = new Actions(driver);
a.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
a.sendKeys("A").perform();

JavascriptExecutor js = (JavascriptExecutor)driver;
WebElement e = driver.findElement(By.name("firstname"));
js.executeScript("arguments[0].click()",e );
js.executeScript("arguments[0].setAttribute('value', 'madhu')", e);
js.executeScript("window.scrollBy(0,3000", " ");
js.executeScript("window.scrollIntoView()",e);
js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
 
	}
}
 
