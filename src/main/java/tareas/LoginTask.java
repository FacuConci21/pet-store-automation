package tareas;

import iu.LoginForm;
import iu.MainPage;
import navegacion.LoginPageNav;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private String username;
    private String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static LoginTask with(String username, String password) {
        return instrumented(LoginTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.username).into(LoginForm.INPUT_TXT_USERNAME),
                Enter.theValue(this.password).into(LoginForm.INPUT_TXT_PASSWORD),
                Click.on(LoginForm.INPUT_SUBMIT_LOGIN)
        );
    }
}
