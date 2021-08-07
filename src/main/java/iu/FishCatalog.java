package iu;

import net.serenitybdd.screenplay.targets.Target;

public interface FishCatalog {
    Target LBL_FI_SW_01 = Target.the("FI-SW-01 label")
            .locatedBy("//a[normalize-space()='FI-SW-01']");

    Target LBL_ADD_TO_CART = Target.the("Add to Cart label")
            .locatedBy("//tbody/tr[2]/td[5]/a[1]");
}
