import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {
    public static void main(String[] args){
        try {

            // Providing Path of Chrome Driver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saura\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            // It will Open web Page on Chrome of below URL
            driver.get("https://demoqa.com/login");

            // Fetching Username InputBox by its ID
            WebElement username = driver.findElement(By.id("userName"));
            username.isDisplayed();
            username.isEnabled();
           // Assign username Value
            username.sendKeys("saurabhsingh27");

            // Fetching Password InputBox by its ID
            WebElement password = driver.findElement(By.id("password"));
            password.isDisplayed();
            password.isEnabled();
            // Assign Password Value
            password.sendKeys("Punjab@123");

            // Fetching Login Button by its ID
            WebElement login = driver.findElement(By.id("login"));
            login.isDisplayed();
            login.isEnabled();
            // Click on Login Button
            login.click();

        }
        catch (SessionNotCreatedException e){
            System.out.println("Check your Chrome version with Chrome Driver Version ");
        }
    }
}