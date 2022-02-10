package demo.pageobjects;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage  {

    public static final Target ahuaTextInputButton = Target.the("ahua text input button").located(MobileBy.AccessibilityId("AhuaTextInputButton"));

     public static final Target ahuaTextInput = Target.the("ahua text input").located(MobileBy.AccessibilityId("AhuaTextInput"));
}
