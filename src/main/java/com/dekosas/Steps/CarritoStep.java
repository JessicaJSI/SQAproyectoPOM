package com.dekosas.Steps;

import com.dekosas.Models.EsperaExplicita;
import com.dekosas.Models.Scroll;
import com.dekosas.PageObjects.CarritoPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class CarritoStep{

    CarritoPageObject carritoPageObject = new CarritoPageObject();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();

    @Step
    public void btnPasaporCaja(){
        EsperaExplicita.esperaExplicitaTexto(carritoPageObject.getDriver(), carritoPageObject.getMsjvalidarTotalpedido());
        carritoPageObject.getDriver().findElement(carritoPageObject.getBtnPasarPorCaja()).click();
    }

    @Step
    public void ingresarDireccion() throws IOException {
        EsperaExplicita.esperarCargaPaginas(carritoPageObject.getDriver());
        scroll.scrollElemento(carritoPageObject.getDriver(), carritoPageObject.getTxtDireccion());
        carritoPageObject.getDriver().findElement(carritoPageObject.getTxtDireccion()).sendKeys(datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,2));
    }


}
