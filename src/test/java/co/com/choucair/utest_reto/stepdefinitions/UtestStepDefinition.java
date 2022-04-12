package co.com.choucair.utest_reto.stepdefinitions;

import co.com.choucair.utest_reto.model.UserInformation;
import co.com.choucair.utest_reto.questions.AnswerRegistration;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.choucair.utest_reto.questions.AnswerRegistration.answerRegistration;
import static co.com.choucair.utest_reto.tasks.FillPageFinalInformation.fillPageFinalInformationWith;
import static co.com.choucair.utest_reto.tasks.FillPageUserDevice.fillPageUserDeviceWith;
import static co.com.choucair.utest_reto.tasks.FillPageUserInformation.fillPageUserInformationWith;
import static co.com.choucair.utest_reto.tasks.FillPageUserLocation.fillPageUserLocationWith;
import static co.com.choucair.utest_reto.tasks.OpenHomePageUtest.OpenHomePageUtest;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinition {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^User wants to register$")
    public void userWantsToRegister() {
        theActorCalled("User").wasAbleTo(OpenHomePageUtest());
    }

    @When("^Complete registration information$")
    public void completeRegistrationInformation(List<UserInformation> userInformations) {

        theActorInTheSpotlight().attemptsTo(fillPageUserInformationWith(userInformations),
                fillPageUserLocationWith(userInformations),
                fillPageUserDeviceWith(userInformations),
                fillPageFinalInformationWith(userInformations));

    }

    @Then("^Complete registration$")
    public void completeRegistration(List<UserInformation> response) {
        theActorInTheSpotlight().should(seeThat(answerRegistration(response)));
    }

}
