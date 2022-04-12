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

import static co.com.choucair.utest_reto.userinterface.PageUserDevices.*;

public class FillPageUserDevice implements Task {

    private List<UserInformation> data;

    public FillPageUserDevice(List<UserInformation> userInformations) {
        this.data = userInformations;
    }

    public static FillPageUserDevice fillPageUserDeviceWith(List<UserInformation> userInformations) {
        return Tasks.instrumented(FillPageUserDevice.class, userInformations);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CONTAINER_COMPUTER),
                Enter.theValue(data.get(0).getComputer()).into(COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(COMPUTER),
                Hit.the(Keys.ENTER).into(COMPUTER),
                Click.on(CONTAINER_VERSION),
                Enter.theValue(data.get(0).getVersion()).into(VERSION),
                Hit.the(Keys.ARROW_DOWN).into(VERSION),
                Hit.the(Keys.ENTER).into(VERSION),
                Click.on(CONTAINER_LANGUAJE),
                Enter.theValue(data.get(0).getLanguaje()).into(LANGUAJE),
                Hit.the(Keys.ARROW_DOWN).into(LANGUAJE),
                Hit.the(Keys.ENTER).into(LANGUAJE),
                Click.on(CONTAINER_MOVIL_DEVICE),
                Enter.theValue(data.get(0).getMovilDevice()).into(MOVIL_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(MOVIL_DEVICE),
                Hit.the(Keys.ENTER).into(MOVIL_DEVICE),
                Click.on(CONTAINER_MODEL_DEVICE),
                Enter.theValue(data.get(0).getModelDevice()).into(MODEL_DEVICE),
                Hit.the(Keys.ARROW_DOWN).into(MODEL_DEVICE),
                Hit.the(Keys.ENTER).into(MODEL_DEVICE),
                Click.on(CONTAINER_OS),
                Enter.theValue(data.get(0).getOs()).into(OS),
                Hit.the(Keys.ARROW_DOWN).into(OS),
                Hit.the(Keys.ENTER).into(OS),
                Click.on(BUTTON_FINISH)
                );

    }
}
