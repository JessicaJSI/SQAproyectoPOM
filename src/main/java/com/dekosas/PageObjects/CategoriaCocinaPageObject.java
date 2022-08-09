package com.dekosas.PageObjects;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter

public class CategoriaCocinaPageObject extends PageObject {

    By accesoriosCocina = By.xpath("//*[@href='https://dekosas.com/co/mesa-y-cocina?cat=845']");
    By prodPlacaInduccion = By.xpath("//*[@href='https://dekosas.com/co/placa-de-coccion-por-induccion-tramontina' and @class='product-item-link'] ");
    By prodMonomandoDorado = By.xpath("//*[@href='https://dekosas.com/co/mezclador-monomando-gold-tramontina' and @class='product-item-link']");

}
