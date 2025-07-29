import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenGoogleTest {
    @Test
    public void AliExpressTest() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.aliexpress.com/");
        driver.findElement(By.name("searchWords")).sendKeys("Blouse"+ Keys.ENTER);
        driver.findElement(By.name("searchWords")).clear();

        driver.findElement(By.name("searchWords")).sendKeys("mouse"+ Keys.ENTER);

        //option 8; id: unique; so easy to capture, name, className, position:xpath, cssSelector: tall, fat like wise, TagName : element: Textarea, name : attribute
        //driver.quit();
    }
}
