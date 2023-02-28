package Test;
import Steps.FormSteps;

public class FormTest {

    public void SubmitForm(){
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
