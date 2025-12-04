package com.corporate.questions.otros;

import com.corporate.UI.otros.UATLoginUI;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.corporate.UI.otros.UATLoginUI.TXT_VERIFICAR;

public class ValidaLoginUAT implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String message = UATLoginUI.TXT_VERIFICAR.resolveFor(actor).getText();
        //WebElementFacade elementLogin = TXT_VERIFICAR.resolveFor(actor);

        return message.contains("You logged into a secure area!");

    }

    public static Question<Boolean> assertion() {
        return new ValidaLoginUAT();
    }

}
