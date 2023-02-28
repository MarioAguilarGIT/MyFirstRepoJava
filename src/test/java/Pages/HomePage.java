package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    @FindBy(id= "first-name")
    public WebElement first_name;

    @FindBy(id= "last-name")
    public WebElement last_name;

    @FindBy(id= "job-title")
    public WebElement job_title;

    @FindBy(xpath = "//input[@id='radio-button-2']")
    public WebElement College;

    @FindBy(xpath = "//input[@id='checkbox-1']")
    public WebElement Gender;

    @FindBy(xpath = "//select class[@id='select-menu']")
    public WebElement Experience;

    @FindBy(xpath = "//input[@id= 'datepicker']")
    public WebElement today_date;

    @FindBy(xpath = "//linkText= '/thanks']")
    public  WebElement Submit;

}
