package com.dekosas.PageObjects;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://dekosas.com/co")
@Getter

public class PaginaPrincipalPageObject extends PageObject{

    By btnMiCuenta = By.xpath("//*[text()='Mi Cuenta']");
    By txtUsuario = By.id("social_login_email");
    By txtClave = By.id("social_login_pass");
    By btnEntrar = By.id("bnt-social-login-authentication");
    By btnTodaLaTienda = By.id("main-toggle-menu");
    //By btnCocina = By.xpath("//*[@href='mesa-y-cocina']");
    By btnCocina = By.xpath("//*[@href='https://dekosas.com/co/mesa-y-cocina']");
    By btnCarroCompras = By.xpath("//*[@href='https://dekosas.com/co/checkout/cart/' and @class='action showcart']");

}
