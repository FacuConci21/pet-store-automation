package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface LoginForm {

    Target INPUT_TXT_USERNAME = Target.the("Username text box")
            .locatedBy("//input[@name='username']");
    Target INPUT_TXT_PASSWORD = Target.the("Password text box")
            .locatedBy("//input[@name='password']");
    Target INPUT_SUBMIT_LOGIN = Target.the("Login button")
            .locatedBy("//input[@name='signon']");

    /*
    Target  = Target.the("").locatedBy("");
    */
}
