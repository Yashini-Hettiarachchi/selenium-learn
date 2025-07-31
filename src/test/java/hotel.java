import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HotelSearchTest {

    @Test
    public void bookingSearchTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional, for better visibility
        driver.get("https://www.booking.com/index.html?aid=393655&pagename=en-lk-hotels");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locate the search input field for destination
        WebElement destinationInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ada790228e']/ul/li")));

        destinationInput.sendKeys("Colombo");
        destinationInput.sendKeys(Keys.ENTER);

//        // Wait for the search results to load
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-testid='property-card']")));
//
//        // Optional: Print hotel names (first few results)
//        List<WebElement> hotelNames = driver.findElements(By.cssSelector("div[data-testid='title']"));
//        for (WebElement hotel : hotelNames) {
//            System.out.println(hotel.getText());
//        }

        driver.quit();
    }
}
