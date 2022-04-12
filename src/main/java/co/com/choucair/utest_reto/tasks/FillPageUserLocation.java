package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.model.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageUserLocation.*;

public class FillPageUserLocation implements Task {
    private List<UserInformation> data;

    public FillPageUserLocation(List<UserInformation> userInformations) {
        this.data = userInformations;
    }

    public static FillPageUserLocation fillPageUserLocationWith(List<UserInformation> userInformations) {
        return Tasks.instrumented(FillPageUserLocation.class, userInformations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getCity()).into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue(data.get(0).getZip()).into(POSTAL_CODE),
                Click.on(CONTAINER_COUNTRY),
                Enter.theValue(data.get(0).getCountry()).into(COUNTRY),
                Click.on(BUTTON_DEVICES)
                );
    }
}
