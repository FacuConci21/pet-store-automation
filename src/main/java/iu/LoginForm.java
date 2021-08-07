package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface LoginForm {

    Target INPUT_TXT_USERNAME = Target.the("Username text box")
            .locatedBy("//input[@id='stripes--1981077719']");
    Target INPUT_TXT_PASSWORD = Target.the("Password text box")
            .locatedBy("//input[@name='password']");
    Target INPUT_SUBMIT_LOGIN = Target.the("Login button")
            .locatedBy("//input[@name='signon']");
    Target LI_LABEL = Target.the("Sign on fail label")
            .locatedBy("//li[contains(text(),'Signon failed.')]");

}
