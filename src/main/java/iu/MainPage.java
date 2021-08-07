package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface MainPage {

    Target LINK_SIGN_IN = Target.the("Sign in button")
            .locatedBy("//a[contains(text(),'Sign In')]");

    Target INPUT_TXT_KEYWORD = Target.the("Search box")
            .locatedBy("//input[@name='keyword']");

    Target INPUT_SUBMIT_SEARCH = Target.the("Search button")
            .locatedBy("//input[@name='searchProducts']");

    Target LBL_FISH = Target.the("Fish label")
            .locatedBy("//img[@src='../images/fish_icon.gif']");
}
