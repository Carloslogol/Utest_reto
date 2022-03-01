package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.userinterface.PageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPageUtest implements Task {

    private PageUtest pageUtest;

    public static OpenPageUtest page() {

        return Tasks.instrumented(OpenPageUtest.class);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(pageUtest),
                Click.on(PageUtest.JOIN_BUTTON));

    }
}
