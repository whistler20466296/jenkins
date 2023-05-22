package PAGE;







import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BINDING.HOOKS;//import BINDING.Hooks;
import PAGEACTION.pageact;







public class nykaahomepage extends HOOKS {



 //public static WebDriver driver;







 // locator



 public static WebElement SearchArea = driver



 .findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[1]/div/form/input"));



 public static String searchText = "watches";







 public static void clickInElement()







 {







 // nykaahomebage.clickInElement(SearchArea);



  pageact.CliconEkement(SearchArea);



 pageact.EnterText(SearchArea, searchText);







 }







}



