//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
    //Open google
    //Go to Google home page
    public static void main(String[] args) {
//        System.setProperty("chrome",""); for normal human

//        System.setProperty("webdriver.chrome.driver","D:\\selenium\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
//        for selenium
        WebDriver driver=new ChromeDriver(); //WebDriver-> major component
        driver.get("https://www.google.com/");
        driver.quit(); //exit code 0 successfully run
//                driver.close()


//Web application automation framework

    }
}
