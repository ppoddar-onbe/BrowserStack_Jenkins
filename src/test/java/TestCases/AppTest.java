package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	public WebDriver _driver;
	
	 
    @Test
    public void logintest()
    {
    	//WebDriverManager.chromedriver().setup();
    	//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
    	
        _driver = new ChromeDriver(options);
        _driver.manage().window().maximize();
        _driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        String title = _driver.getTitle();
        Assert.assertEquals(title, "Test Login | Practice Test Automation");
        
    }
}
