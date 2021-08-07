package navegacion;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable mainPage() {
        return Task.where("{0} Opens Pet Store main page",
                Open.browserOn().the(MainPageNav.class)
        );
    }

    public static Performable signInPage(){
        return Task.where(
                "{0} Login page of Pet Store",
                Open.browserOn().the(LoginPageNav.class)
        );
    }
}
