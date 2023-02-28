package Steps;
import Pages.*;

public class FormSteps extends  HomePage{

    public void enterFirstName(){
        String FIRST_NAME = "Mario";
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        String LAST_NAME = "Automan";
        this.last_name.sendKeys(LAST_NAME);
    }

    public void enterTitle(){
        String TITLE = "Automation";
        this.job_title.sendKeys(TITLE);
    }

    public void click_highest_Edu_level(){
        this.College.click();
    }

    public void click_gender(){
        this.Gender.isEnabled();
    }

    public void enterDate(){
        String DATE = "03/01/2023";
        this.today_date.sendKeys(DATE);
    }

    public void click_Submit(){
        this.Submit.click();
    }



}
