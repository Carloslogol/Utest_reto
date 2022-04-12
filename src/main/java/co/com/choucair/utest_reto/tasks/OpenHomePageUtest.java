package co.com.choucair.utest_reto.tasks;

import co.com.choucair.utest_reto.userinterface.HomePageUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenHomePageUtest implements Task {

    private HomePageUtest HomepageUtest;

    public static OpenHomePageUtest OpenHomePageUtest() {
        return Tasks.instrumented(OpenHomePageUtest.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(HomepageUtest),
                Click.on(HomePageUtest.JOIN_BUTTON));

    }
}
