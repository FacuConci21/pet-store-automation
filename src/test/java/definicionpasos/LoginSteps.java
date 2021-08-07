package definicionpasos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegacion.NavigateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;
import question.LoginFormQuestion;
import tareas.LoginTask;

public class LoginSteps {

    private String actorName = "Sheldon";

    @Given("on the main page for login")
    public void on_the_main_page_for_login() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.actorName).attemptsTo(
                NavigateTo.signInPage()
        );
    }

    @When("a user enters the values {string} y {string}")
    public void a_user_enters_the_values_y(String username, String password) {
        OnStage.theActor(this.actorName).attemptsTo(
                LoginTask.with(username, password)
        );
    }

    @Then("the login fails")
    public void the_login_fails() {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(" Signon failed.",
                        LoginFormQuestion.singInFailed(),
                        StringContains.containsString(" Signon failed.")
                )
        );
    }
}
