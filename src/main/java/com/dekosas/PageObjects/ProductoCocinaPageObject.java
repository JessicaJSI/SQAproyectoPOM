package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoCocinaPageObject extends PageObject {

    By txtCantidad = By.id("qty");
    By btnAgregarCarrito = By.id("product-addtocart-button");
    By txtBarraBuscar = By.id("search");
    By btnBuscar = By.xpath("//button[@class='action search']");
    By divCargando = By.xpath("//div[@class='loading-mask']");
    By prodMonomandoNegro = By.xpath("//*[@href='https://dekosas.com/co/mezclador-monomando-black-tramontina' and @class='product-item-link']");
    By paginaInicial = By.xpath("//*[@href='https://dekosas.com/co/']");

    By msjValidacionCarrito = By.xpath("//div[@class='cart-summary']");

    public By getMsjValidacionCarrito() {
        return msjValidacionCarrito;
    }

    public By getPaginaInicial() {
        return paginaInicial;
    }

    public By getDivCargando() {
        return divCargando;
    }

    public By getTxtCantidad() {
        return txtCantidad;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getTxtBarraBuscar() {
        return txtBarraBuscar;
    }

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getProdMonomandoNegro() {
        return prodMonomandoNegro;
    }
}
