package co.com.choucair.utest_reto.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class HomePageUtest extends PageObject {

    public static final Target JOIN_BUTTON = Target.the("Button to start registration")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
