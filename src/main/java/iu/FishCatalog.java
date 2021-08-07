package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface FishCatalog {
    Target LBL_FI_SW_01 =Target.the("Label de FI-SW-01")
            .locatedBy("//a[normalize-space()='FI-SW-01']");

    Target LBL_ADD_TO_CART =Target.the("Label de Add to Cart")
            .locatedBy("//tbody/tr[2]/td[5]/a[1]");
}
