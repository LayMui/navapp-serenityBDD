package demo.stepdefinitions;

import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import com.applitools.eyes.appium.Eyes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import demo.pageobjects.HomePage;
import demo.tasks.EnterText;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AhuaTextInputStepDefinitions {

    private final Logger log = LoggerFactory.getLogger(AhuaTextInputStepDefinitions.class);
    @Steps
    HomePage homePage;

  
    @Before()
    public void setTheStage() throws IOException {
        OnStage.setTheStage(new OnlineCast());
     
    }

    @After()
    public void drawTheCurtain() {
        OnStage.drawTheCurtain();
    }
    
    @Given("^(.*) is at the app$")
    public void janIsAtTheApp(String actor) {
        theActorCalled(actor)
                .should(
                         eventually(seeThat(the(HomePage.ahuaTextInputButton), isVisible())));
    
    }

    @When("he want to enter text to the text input {}")
    public void heWantsToEnterTextToTheTextInput(String text) {
        theActorInTheSpotlight().attemptsTo(EnterText.intoAhuaTextInput(text));
    }

    @Then("he is able to see text entered")
    public void heIsAbleToSeeTheTextEntered() {
      
    }
   
}
