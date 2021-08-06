package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPaginaPrincipal {
    //Mapeo del boton Sign in
    public static final Target BTN_SIGN_IN = Target.the("Boton para ir al formulario de iniciar sesion")
                                                   .locatedBy("//a[normalize-space()='Sign In']");

    //Mapeo para ingresar el nombre de usuario
    public static final Target TXT_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario")
            .locatedBy("//input[@name='username']");

    //Mapeo para ingresar la contraseña
    public static final Target TXT_PASSWORD = Target.the("Caja de texto para ingresar la contraseña")
            .locatedBy("//input[@name='password']");


    //Mapeo del boton Login
    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .locatedBy("//input[@name='signon']");


}
