package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPageObject extends PageObject {
    By verificarIngreso = By.xpath("//a[@href='/co/customer/account/']");

    public By getVerificarIngreso() {
        return verificarIngreso;
    }
}
