package co.com.choucair.utest_reto.stepdefinitions;

import co.com.choucair.utest_reto.model.Utest_data;
import co.com.choucair.utest_reto.questions.AnswerData;
import co.com.choucair.utest_reto.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UtestStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^User wants to register$")
    public void userWantsToRegister() {

        theActorCalled("User").wasAbleTo(OpenPageUtest.page());

    }

    @When("^Complete registration information$")
    public void completeRegistrationInformation(List<Utest_data> data) {

        theActorInTheSpotlight().attemptsTo(FillPageInfo.page(data), FillPageLocation.page(data),
                FillPageDevice.page(data), FillPageFinish.page(data));

    }

    @Then("^Complete registration$")
    public void completeRegistration(List<Utest_data> data) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerData.answer(data)));

    }

}
