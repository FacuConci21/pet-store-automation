package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface ShoppingCart {

    Target BTN_CHECKOUT = Target.the("Confirm buy button")
            .locatedBy("//a[normalize-space()='Proceed to Checkout']");
}
