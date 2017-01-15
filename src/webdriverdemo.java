import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverdemo {
   public static void main(String[] args) {

	   System.setProperty("webdriver.chrome.driver", "D:\\develop\\selenium\\selenium-demo\\resources\\chromedriver_win32\\chromedriver.exe");
	   System.setProperty("webdriver.chrome.logfile","D:\\develop\\selenium\\selenium-demo\\resources\\chromedriver_win32\\chromedriver.txt");

      WebDriver driver = new ChromeDriver();
      //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      
      //Launch website
      driver.navigate().to("http://www.calculator.net/");
      
      //Maximize the browser
      driver.manage().window().maximize();
      
      // Click on Math Calculators
      driver.findElement(By.xpath(".//*[@id='hcalc']/table/tbody/tr/td[2]/div[3]/a")).click();
      
      // Click on Percent Calculators
      driver.findElement(By.xpath("//*[@id='content']/ul[1]/li[3]/a")).click();
      
      // Enter value 10 in the first number of the percent Calculator
      driver.findElement(By.id("cpar1")).sendKeys("10");
      
      // Enter value 50 in the second number of the percent Calculator
      driver.findElement(By.id("cpar2")).sendKeys("50");
      
      // Click Calculate Button
      driver.findElement(By.xpath("//*[@id='content']/table[1]/tbody/tr[2]/td/input[2]")).click();

      
      // Get the Result Text based on its xpath
      String result = driver.findElement(By.xpath("//*[@id='content']/p[2]")).getText();

      
      // Print a Log In message to the screen
      System.out.println(" The Result is " + result);
      
      //Close the Browser.
      driver.close();
   }
}