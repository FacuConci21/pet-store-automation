package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface MainPage {

    Target BTN_SIGN_IN = Target.the("Boton para ir al formulario de iniciar sesion")
            .locatedBy("//a[normalize-space()='Sign In']");

    Target TXT_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario")
            .locatedBy("//input[@name='username']");

    Target TXT_PASSWORD = Target.the("Caja de texto para ingresar la contraseña")
            .locatedBy("//input[@name='password']");

    Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .locatedBy("//input[@name='signon']");

    Target INPUT_TXT_KEYWORD = Target.the("Search box")
            .locatedBy("//input[@name='keyword']");

    Target INPUT_SUBMIT_SEARCH = Target.the("Search button")
            .locatedBy("//input[@name='searchProducts']");

    /*
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
    Target  = Target.the("").locatedBy("");
*/
}
