package demo.tasks;

import org.openqa.selenium.Keys;

import demo.pageobjects.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class EnterText {
    public static Performable intoAhuaTextInput(String text) {
        return Task.where(
                "{0} attempts to enter text #text",
                Click.on(HomePage.ahuaTextInputButton),
               Enter.theValue(text).into(HomePage.ahuaTextInput).thenHit(Keys.ENTER));

    }
}
