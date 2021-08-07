package definicionpasos;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tareas.LoginTask;

public class LoginSteps {

    private String actorName = "Sheldon";

    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.actorName).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @When("a user enters the values {string} y {string}")
    public void a_user_enters_the_values_y(String username, String password) {
        OnStage.theActorCalled(this.actorName).attemptsTo(
                new LoginTask(username, password)
        );
    }

    @Then("the login fails")
    public void the_login_fails() {
    }
}
