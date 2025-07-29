import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {
    WebDriver driver;

    @BeforeMethod //pre condition
    public void openPage() throws InterruptedException {
        //maximum size
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/input.xhtml");
        Thread.sleep(3000);


    }
    //chrome options change version; version can be changed using pom also
    //chrome options maximize screen size and without showing browser running also can show test passes and faliures
    @Test
    public void textBox(){
        //if id duplicate should go with xpath
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        //use with standrand format
        name.sendKeys("Yashini");
        WebElement appendText=driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Sri Lanka");
        boolean enabled=driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is Text Box Enabled"+enabled);
//        driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));

//        Xpath=//tagname[@attribute="value"]
        WebElement clearText=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();
//relative, absolute two xpaths

        WebElement textElement=driver.findElement(By.id("j_idt88:j_idt97"));
        String value=textElement.getAttribute("value");
        System.out.println(value);

        //tag, attribute, value

        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("yash@gmail.com"+ Keys.TAB+"Confirm move to next element");


    }
}
