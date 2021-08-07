package tareas;

import iu.FishCatalog;
import iu.MainPage;
import iu.ShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuyFishTask implements Task {

    public BuyFishTask() {
    }

    public static BuyFishTask with() {
        return instrumented(BuyFishTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.LBL_FISH),
                Click.on(FishCatalog.LBL_FI_SW_01),
                Click.on(FishCatalog.LBL_ADD_TO_CART),
                Click.on(ShoppingCart.BTN_CHECKOUT)
        );
    }
}
