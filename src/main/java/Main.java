import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.booking.com");

        System.out.println(driver.getTitle());
        WebElement element = driver.findElement(By.className("sb-destination__input"));
        System.out.println(element.getAttribute("placeholder"));
    }
}