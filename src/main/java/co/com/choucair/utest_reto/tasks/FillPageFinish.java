package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.model.Utest_data;
import co.com.choucair.utest_reto.userinterface.PageFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageFinish.*;

public class FillPageFinish implements Task {

    private List<Utest_data> data;

    public FillPageFinish(List<Utest_data> data) {
        this.data = data;
    }

    public static FillPageFinish page(List<Utest_data> data) {

        return Tasks.instrumented(FillPageFinish.class, data);

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
