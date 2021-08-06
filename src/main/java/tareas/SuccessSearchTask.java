package tareas;

import iu.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SuccessSearchTask implements Task {

    private String searchValue;

    public SuccessSearchTask(String searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.INPUT_TXT_KEYWORD),
                Enter.theValue(this.searchValue).into(MainPage.INPUT_TXT_KEYWORD),
                Click.on(MainPage.INPUT_SUBMIT_SEARCH)
        );
    }
}
