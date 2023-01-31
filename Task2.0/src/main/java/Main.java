



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        ChromeOptions options = new ChromeOptions();
        driver.manage().window().maximize();
        driver.get("https://store.steampowered.com/");


//        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[1]/div/div[3]/div/a"));
        WebElement button = driver.findElement(By.cssSelector("#global_action_menu > a"));
        button.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));




//        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input"));
//        WebElement input_login = driver.findElement(By.cssSelector("#responsive_page_template_content > div > div:nth-child(1) > div > div > div > div.newlogindialog_FormContainer_3jLIH > div > form > div:nth-child(1) > input"));
//        WebElement input_login = driver.findElement(By.xpath("//div[@class=newlogindialog_TextInput_2eKVn]/input[@type='text']"));
        WebElement input_login = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div/div[1]/div/div/div/div[2]/div/form/div[1]/input"));
        input_login.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        input_login.sendKeys("1234567890");
        WebElement input_pass = driver.findElement(By.xpath("/html/body/div[1]/div[7]/div[6]/div/div[1]/div/div/div/div[2]/div/form/div[2]/input"));
        input_pass.sendKeys("1234567890");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement push_button = driver.findElement(By.cssSelector("#responsive_page_template_content > div"));
        push_button.click();
//        driver.close();


    }

}