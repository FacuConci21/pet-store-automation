package tareas;

import iu.LoginForm;
import iu.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class LoginTask implements Task {
    private String username;
    private String password;

    public LoginTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Acciones necesarias para iniciar sesion
        //1- Ir al formulario de login
        //2- Ingresar el usuario
        //3- Ingresar el password
        //4- Click en login

        actor.attemptsTo(
                Enter.theValue(this.username).into(LoginForm.INPUT_TXT_USERNAME),
                Enter.theValue(this.password).into(LoginForm.INPUT_TXT_PASSWORD),
                Click.on(LoginForm.INPUT_SUBMIT_LOGIN)
        );
    }
}
