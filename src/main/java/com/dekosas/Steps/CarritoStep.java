package com.dekosas.Steps;

import com.dekosas.Models.EsperaExplicita;
import com.dekosas.Models.EsperaImplicita;
import com.dekosas.Models.Scroll;
import com.dekosas.PageObjects.CarritoPageObject;
import com.dekosas.PageObjects.ProductoCocinaPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.ListaDesplegable;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class CarritoStep{

    CarritoPageObject carritoPageObject = new CarritoPageObject();
    ProductoCocinaPageObject productoCocinaPageObject = new ProductoCocinaPageObject();
    Datos datos = new Datos();
    Scroll scroll = new Scroll();
    ListaDesplegable listaDesplegable = new ListaDesplegable();

    @Step
    public void btnPasaporCaja(){
        EsperaExplicita.esperaExplicitaTexto(carritoPageObject.getDriver(), carritoPageObject.getMsjvalidarTotalpedido());
        carritoPageObject.getDriver().findElement(carritoPageObject.getBtnPasarPorCaja()).click();
    }

    @Step
    public void ingresarDireccion() throws IOException {
        //EsperaExplicita.esperarCargaPaginas(carritoPageObject.getDriver());
        EsperaExplicita.esperaExplicitaCondicionada(productoCocinaPageObject.getDivCargando(),carritoPageObject.getDriver());
        scroll.scrollElemento(carritoPageObject.getDriver(), carritoPageObject.getTxtDireccion());
        carritoPageObject.getDriver().findElement(carritoPageObject.getTxtDireccion()).sendKeys(datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,2));
    }

    @Step
    public void seleccionarPais () throws IOException{
        String valor = datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,3);
        listaDesplegable.seleccionarTextoVisible(carritoPageObject.getTxtPais(),valor, carritoPageObject.getDriver());
    }

    @Step
    public void seleccionarDepartamento () throws IOException{
        String valor = datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,4);
        listaDesplegable.seleccionarTextoVisible(carritoPageObject.getTxtDepartamento(),valor, carritoPageObject.getDriver());
    }

    @Step
    public void seleccionarCiudad () throws IOException{
        //EsperaExplicita.esperaExplicitaCondicionada(productoCocinaPageObject.getDivCargando(),carritoPageObject.getDriver());
        EsperaImplicita.esperaImplicita(3);
        String valor = datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,5);
        listaDesplegable.seleccionarTextoVisible(carritoPageObject.getTxtCiudad(),valor, carritoPageObject.getDriver());
    }

    @Step
    public void ingresarNumTelefono () throws IOException{
        carritoPageObject.getDriver().findElement(carritoPageObject.getTxtNumTelefono()).sendKeys(datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,6));
    }

    @Step
    public void seleccionarTipoID () throws IOException{
        String valor = datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,7);
        listaDesplegable.seleccionarTextoVisible(carritoPageObject.getTxtTipoID(),valor, carritoPageObject.getDriver());
    }

    @Step
    public void ingresarNumID () throws IOException{
        carritoPageObject.getDriver().findElement(carritoPageObject.getTxtNumID()).sendKeys(datos.leerDatosExcel("Datos.xlsx","EnvioDatos",1,8));
    }

    @Step
    public void btnSiguientePasoCompra (){
        carritoPageObject.getDriver().findElement(carritoPageObject.getBtnSgtePasoCompra()).click();
    }

    @Step
    public void eliminarProducto (){
        for (int i = 0; i < 3; i++) {
            //EsperaExplicita.esperaExplicitaCondicionada(productoCocinaPageObject.getDivCargando(),carritoPageObject.getDriver());
            EsperaExplicita.esperaExplicitaTexto(carritoPageObject.getDriver(), carritoPageObject.getMsjvalidarTotalpedido());
            carritoPageObject.getDriver().findElement(carritoPageObject.getBtnEliminarProducto()).click();
        }
    }

    @Step
    public void msjVerificacionCarroVacio(){
        Assert.assertThat(carritoPageObject.getDriver().findElement(carritoPageObject.getMsjValidacionCarroVacio()).isDisplayed(), Matchers.is(true));
    }

}
