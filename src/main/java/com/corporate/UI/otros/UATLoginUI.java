package com.corporate.UI.otros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UATLoginUI {
    public static final Target TXT_USUARIO = Target.the("campo usuario").locatedBy("#username");
    public static final Target TXT_CONTRASENA = Target.the("campo contraseña").locatedBy("#password");
    public static final Target BTN_ACCESO = Target.the("mensaje éxito").located(By.xpath("//*[@id='login']/button"));
    //public static final Target BTN_ACCESO = Target.the("botón login").locatedBy("button[type='submit']");
    public static final Target TXT_VERIFICAR = Target.the("mensaje éxito").locatedBy("#flash");

}