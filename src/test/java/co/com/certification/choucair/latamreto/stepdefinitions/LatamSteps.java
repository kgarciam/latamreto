package co.com.certification.choucair.latamreto.stepdefinitions;

import co.com.certification.choucair.latamreto.questions.TheAnswer;
import co.com.certification.choucair.latamreto.tasks.Hacer;
import co.com.certification.choucair.latamreto.tasks.OpenThe;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LatamSteps {




    @Given("^(.*) needs to navegate an search the fly$")
    public void juanchoNeedsToNavegateAnSearchTheFly(String nombre) {
        theActorCalled(nombre).wasAbleTo(OpenThe.Pagweb());



    }


    @When("^he makes the registration entry in the application$")
    public void heMakesTheRegistrationEntryInTheApplication()  {
        theActorInTheSpotlight().attemptsTo(Hacer.clic());


    }

    @Then("^he could be  visualized  in the application the following  message (.*)$")
    public void heCouldBeVisualizedInTheApplicationTheFollowingMessageVBCDGG(String question) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheAnswer.is(question)));


    }

}
