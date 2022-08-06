package com.dekosas.PageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoPageObject extends PageObject {

    By msjvalidarTotalpedido = By.xpath("//*[text()='Total del pedido']");
    By btnPasarPorCaja = By.xpath("//*[text()='Pasar por caja']");
    By txtDireccion = By.xpath("//input[@name='street[0]' and @class='input-text']");

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getMsjvalidarTotalpedido() {
        return msjvalidarTotalpedido;
    }

    public By getBtnPasarPorCaja() {
        return btnPasarPorCaja;
    }

}
