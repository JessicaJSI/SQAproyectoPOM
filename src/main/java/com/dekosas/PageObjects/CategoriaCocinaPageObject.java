package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoriaCocinaPageObject extends PageObject {

    By accesoriosCocina = By.xpath("//*[@href='https://dekosas.com/co/mesa-y-cocina?cat=845']");
    By prodPlacaInduccion = By.xpath("//*[@href='https://dekosas.com/co/placa-de-coccion-por-induccion-tramontina' and @class='product-item-link'] ");
    By prodMonomandoDorado = By.xpath("//*[@href='https://dekosas.com/co/mezclador-monomando-gold-tramontina' and @class='product-item-link']");

    public By getProdMonomandoDorado() {
        return prodMonomandoDorado;
    }

    public By getAccesoriosCocina() {
        return accesoriosCocina;
    }

    public By getProdPlacaInduccion() {
        return prodPlacaInduccion;
    }
}
