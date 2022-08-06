package com.dekosas.StepDefinitions;

import com.dekosas.PageObjects.CategoriaCocinaPageObject;
import com.dekosas.Steps.CategoriaCocinaStep;
import com.dekosas.Steps.PaginaPrincipalStep;
import com.dekosas.Steps.ProductoCocinaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CategoryStepDefiniton {

    CategoriaCocinaPageObject categoriaCocinaPageObject;

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    CategoriaCocinaStep categoriaCocinaStep;

    @Steps
    ProductoCocinaStep productoCocinaStep;

    @Given("^Que el usuario se encuentre en la pagina web$")
    public void queElUsuarioSeEncuentreEnLaPaginaWeb() {
        paginaPrincipalStep.abrirNavegador();
    }

    @When("^Se busca la categoria y subcategoria$")
    public void seBuscaLaCategoriaYSubcategoria() {
        paginaPrincipalStep.btnIrPaginaPrincipal();
        paginaPrincipalStep.clickTodaLaTienda();
        paginaPrincipalStep.clickCategoriaCocina();
        categoriaCocinaStep.clickAccesoriosCocina();
    }

    @When("^se elige un producto, se aumenta en tres y se agrega al carrito$")
    public void seEligeUnProductoSeAumentaEnTresYSeAgregaAlCarrito() {
        categoriaCocinaStep.clickProducto(categoriaCocinaPageObject.getProdPlacaInduccion(), true);
        productoCocinaStep.txtCambiarCantidad();
        productoCocinaStep.btnAgregarAlCarrito();
    }

    @When("^se elige otro producto y se agrega al carrito$")
    public void seEligeOtroProductoYSeAgregaAlCarrito() {
        paginaPrincipalStep.btnIrPaginaPrincipal();
        productoCocinaStep.txtBarraBusqueda("Monomando");
        productoCocinaStep.btnBuscarElemento();
        productoCocinaStep.btnElegirMonomando();
        productoCocinaStep.btnAgregarAlCarrito();
    }

    @Then("^El usuario visualizara en el carrito los objetos seleccionados$")
    public void elUsuarioVisualizaraEnElCarritoLosObjetosSeleccionados() {
        productoCocinaStep.msjVerificacionCarrito();
    }

}
