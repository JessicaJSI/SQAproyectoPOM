package com.dekosas.Steps;

import com.dekosas.Models.EsperaExplicita;
import com.dekosas.Models.Scroll;
import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;


public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();

    @Step
    public void abrirNavegador() {
        paginaPrincipalPageObject.open();
    }

    @Step
    public void clickMiCuenta() {
        //EsperaExplicita.esperaExplicitaClick(paginaPrincipalPageObject.getBtnMiCuenta(), paginaPrincipalPageObject.getDriver());
        paginaPrincipalPageObject.getDriver()
                .findElement(paginaPrincipalPageObject.getBtnMiCuenta()).click();
    }

    @Step
    public void ingresarUsuario() throws IOException {
        //paginaPrincipalPageObject.getDriver().switchTo().alert().sendKeys(usuario);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtUsuario()).sendKeys(datos.leerDatosExcel("Datos.xlsx","Usuario",1,0));
    }

    @Step
    public void ingresarClave () throws IOException{
        //paginaPrincipalPageObject.getDriver().switchTo().alert().sendKeys(clave);
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getTxtClave()).sendKeys(datos.leerDatosExcel("Datos.xlsx","Usuario",1,1));
    }

    @Step
    public void clickEntrar() {
        //paginaPrincipalPageObject.getDriver().switchTo().alert().accept();
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnEntrar()).click();
    }

    @Step
    public void clickTodaLaTienda(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnTodaLaTienda()).click();
    }

    @Step
    public void clickCategoriaCocina(){
        //EsperaExplicita.esperarCargaPaginas(paginaPrincipalPageObject.getDriver());
        //scroll.scrollElemento(paginaPrincipalPageObject.getDriver(), paginaPrincipalPageObject.getBtnCocina());
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCocina()).click();
    }

    @Step
    public void btnIrPaginaPrincipal(){
        EsperaExplicita.esperarCargaPaginas(paginaPrincipalPageObject.getDriver());
        paginaPrincipalPageObject.getDriver().navigate().to("https://dekosas.com/co/");
    }

    @Step
    public void btnIrCarroCompras(){
        paginaPrincipalPageObject.getDriver().findElement(paginaPrincipalPageObject.getBtnCarroCompras()).click();
    }

}
