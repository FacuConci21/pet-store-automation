package definicionpasos;

import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tareas.IniciarSesionTask;

public class IniciarSesionSteps {

    private String nombre_actor = "Pepito";


    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());

        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @Cuando("inicio sesion con los valores {string} y {string}")
    public void inicio_sesion_con_los_valores_y(String usuario, String password) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                new IniciarSesionTask(usuario, password)
        );
    }

    @Entonces("ingrese correctamente a mi usuario")
    public void ingrese_correctamente_a_mi_usuario() {
    }
}
