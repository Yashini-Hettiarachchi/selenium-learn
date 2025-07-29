import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class LinkExample {
    WebDriver driver;

    @BeforeMethod //pre condition
    public void openPage(){
        //maximum size
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/link.xhtml");

    }

    @Test
    //01)Take me to dashboard
    public void linkTest(){
        //driver.findElement(By.linkText("Go to Dashboard")).click();
        //first link get when element are same
        WebElement homeLink=driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();
        //refresh, forward

        WebElement findLink=driver.findElement(By.partialLinkText("Find the URL"));
//        when new relize coming no failure, if use partial...
        String path=findLink.getAttribute("href");
        System.out.println(path);

        WebElement brokenLink=driver.findElement(By.partialLinkText("Broken?"));
//        when new relize coming no failure, if use partial...
        brokenLink.click();
        String title=driver.getTitle();
        if(title.contains("404")){
            System.out.println("Link is broken");
        } else{
            System.out.println("Link is not broken");

        }
        driver.navigate().back();

//        duplicateLink
        //homeLink.click();
        //same properity value use again


        WebElement homeLink1=driver.findElement(By.linkText("Go to Dashboard"));
        homeLink1.click();
        driver.navigate().back();



//        WebElement countLink=driver.findElements(By.tagName("a"));
//        can't store in the webElement, more than one elements

        List<WebElement> countFullPageLinks = driver.findElements(By.tagName("a"));
        int pageLinkCount = countFullPageLinks.size();
        System.out.println("Count of links in the page :"+pageLinkCount);
// By class
        WebElement layoutElemnent=driver.findElement(By.className("layout-main-content"));
        List<WebElement> countLayoutLinks = layoutElemnent.findElements(By.tagName("a"));
        System.out.println("Count of links in the layout :"+countLayoutLinks.size());








    }
}
