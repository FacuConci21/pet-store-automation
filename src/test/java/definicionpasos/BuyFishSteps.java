package definicionpasos;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import navegacion.NavigateTo;
import tareas.BuyFishTask;

public class BuyFishSteps {

    private String actorName = "Facundo";

    @Given("beginning on the main page")
    public void beginning_on_the_main_page() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.actorName).attemptsTo(
                NavigateTo.mainPage()
        );
    }

    @When("I complete the steps for buy a fish")
    public void i_complete_the_steps_for_buy_a_fish() {
        OnStage.theActor(this.actorName).attemptsTo(
                BuyFishTask.with()
        );
    }

    @Then("I see the message {string}")
    public void i_see_the_message(String message) {
    }

}
