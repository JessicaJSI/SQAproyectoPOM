package com.dekosas.PageObjects;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter

public class PaginaUsuarioPageObject extends PageObject {
    By verificarIngreso = By.xpath("//a[@href='/co/customer/account/']");

}
