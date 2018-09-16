package Search;

import Base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputSearch extends CommonApi {
    @Test
    public  void search(){
        driver.findElement(By.id("email")).sendKeys("ahmeduf");
    }

}
