package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface ShoppingCart {

    Target BTN_CHECKOUT =Target.the("Boton para confirmar comprar")
            .locatedBy("//a[normalize-space()='Proceed to Checkout']");
}
