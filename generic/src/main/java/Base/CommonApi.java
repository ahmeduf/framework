package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver=null;
    String url = "https://www.FaceBook.com/";
    @BeforeMethod
    public void setup(String url){
        this.url=url;
        System.setProperty("webdriver.gecko.driver","/Users/URMI/IdeaProjects/yourgoal/generic/Browser-Driver/geckodriver");
        driver=new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void cleanup(){
        driver.close();
    }
}
