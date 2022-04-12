package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.model.UserInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageFinishRegister.*;

public class FillPageFinalInformation implements Task {

    private List<UserInformation> data;

    public FillPageFinalInformation(List<UserInformation> userInformations) {
        this.data = userInformations;
    }

    public static FillPageFinalInformation fillPageFinalInformationWith(List<UserInformation> userInformations) {

        return Tasks.instrumented(FillPageFinalInformation.class, userInformations);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).getPass()).into(PASS),
                Enter.theValue(data.get(0).getPass()).into(PASS_VALIDATE),
                Click.on(CHECKBOX_SEND_NEWS),
                Click.on(CHECKBOX_PRIVACY),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(BUTTON_FINISH));
    }
}
