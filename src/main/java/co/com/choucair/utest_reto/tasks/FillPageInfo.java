package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.model.Utest_data;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.choucair.utest_reto.userinterface.PageInfo.*;

public class FillPageInfo implements Task {

    private List<Utest_data> data;

    public FillPageInfo(List<Utest_data> data) {
        this.data = data;
    }

    public static FillPageInfo page(List<Utest_data> data) {

        return Tasks.instrumented(FillPageInfo.class, data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(data.get(0).getName()).into(NAME),
                Enter.theValue(data.get(0).getLastName()).into(LAST_NAME),
                Enter.theValue(data.get(0).getEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(data.get(0).getBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(data.get(0).getBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(data.get(0).getBirthYear()).from(BIRTH_YEAR),
                Click.on(BUTTON_LOCATION)
    );

    }
}
