package Test;
import Steps.FormSteps;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    public void SubmitForm(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");

        FormSteps actions = new FormSteps();

        actions.enterFirstName();
        actions.enterLastName();
        actions.enterTitle();
        actions.click_highest_Edu_level();
        actions.click_gender();
        actions.enterDate();
        actions.click_Submit();


    }



}
