import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task1 {

  public static void main(String[] args){

      //Browser Initialization
          WebDriver driver = new ChromeDriver();

     //Maximize the Browser
          driver.manage().window().maximize();

     //openBrowser
      driver.get("https://demo.nopcommerce.com/register");

     //Fill in all required fields
      driver.findElement(By.id("FirstName")).sendKeys("Mai");
      driver.findElement(By.name("LastName")).sendKeys("Ziada");
      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("MZ2025@email.com");
      driver.findElement(By.name("Password")).sendKeys("test1234");
      driver.findElement(By.id("ConfirmPassword")).sendKeys("test1234");

    //Register
      driver.findElement(By.cssSelector("#register-button")).click();
   // Get Text
      String Msg = driver.findElement(By.className("result")).getText();
      System.out.println(Msg);
      driver.findElement(By.xpath("//*[text()='Continue']")).click();

    //Logout&Login
      driver.findElement(By.linkText("Log out")).click();
      driver.findElement(By.linkText("Log in")).click();

      //Fill in login data
      driver.findElement(By.cssSelector("[type='email']")).sendKeys("MZ2025@email.com");
      driver.findElement(By.cssSelector("[type='password']")).sendKeys("test1234");
     //Login
      driver.findElement(By.xpath("//button[@type='submit']")).click();

  }

}
