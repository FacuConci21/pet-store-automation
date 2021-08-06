package tareas;

import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesionTask implements Task {
    private String username;
    private String password;

    public IniciarSesionTask(String username, String password) {
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
                Click.on(FormularioPaginaPrincipal.BTN_SIGN_IN),
                Enter.theValue(this.username).into(FormularioPaginaPrincipal.TXT_USERNAME),
                Enter.theValue(this.password).into(FormularioPaginaPrincipal.TXT_PASSWORD),
                Click.on(FormularioPaginaPrincipal.BTN_LOGIN)
        );
    }
}
