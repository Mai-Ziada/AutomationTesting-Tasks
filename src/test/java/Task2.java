
import com.sun.tools.javac.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    protected WebDriver driver;

    //Default Constructor
    public Task2() {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
    }
    public void Cucumber() {
        WebElement SelectCucumber = driver.findElement(By.xpath("//h4[contains(text(),'Cucumber')]/parent::div[@class='product']//button[text()='ADD TO CART']"));
        SelectCucumber.click();
    }
    public static void main(String[] args) {
        Task2 obj = new Task2 ();
        obj.Cucumber();
    }
}