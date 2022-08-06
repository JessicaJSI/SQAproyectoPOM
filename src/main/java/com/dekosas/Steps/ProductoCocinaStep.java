package com.dekosas.Steps;

import com.dekosas.Models.EsperaExplicita;
import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import com.dekosas.PageObjects.ProductoCocinaPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ProductoCocinaStep {

    ProductoCocinaPageObject productoCocinaPageObject = new ProductoCocinaPageObject();
    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void txtCambiarCantidad(){
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getTxtCantidad()).clear();
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getTxtCantidad()).sendKeys("3");
    }

    @Step
    public void btnAgregarAlCarrito(){
        EsperaExplicita.esperaExplicitaCondicionada(productoCocinaPageObject.getDivCargando(), productoCocinaPageObject.getDriver());
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getBtnAgregarCarrito()).click();
    }

    @Step
    public void txtBarraBusqueda(String elementoABuscar){
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getTxtBarraBuscar()).sendKeys(elementoABuscar);
    }

    @Step
    public void btnBuscarElemento(){
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getBtnBuscar()).click();
    }

    @Step
    public void btnElegirMonomando(){
        productoCocinaPageObject.getDriver().findElement(productoCocinaPageObject.getProdMonomandoNegro()).click();
    }

    @Step
    public void msjVerificacionCarrito(){
        Assert.assertThat(paginaPrincipalPageObject.getDriver().findElement(productoCocinaPageObject.getMsjValidacionCarrito()).isDisplayed(), Matchers.is(true));
    }


}
