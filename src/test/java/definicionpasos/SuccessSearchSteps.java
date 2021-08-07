package definicionpasos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navegacion.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tareas.SuccessSearchTask;

public class SuccessSearchSteps {

    private String actor = "Casual User";

    @Given("on the main page")
    public void on_the_main_page() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.actor).attemptsTo(
                NavigateTo.mainPage()
        );
    }

    @When("user insert {string} in the search box")
    public void user_insert_in_the_search_box(String searchValue) {
        OnStage.theActor(this.actor).attemptsTo(
                new SuccessSearchTask(searchValue)
        );
    }

    @Then("user see the results")
    public void user_see_the_results() {
    }

}
