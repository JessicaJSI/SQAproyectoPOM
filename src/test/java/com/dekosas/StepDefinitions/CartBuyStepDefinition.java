package com.dekosas.StepDefinitions;

import com.dekosas.PageObjects.CategoriaCocinaPageObject;
import com.dekosas.PageObjects.ProductoCocinaPageObject;
import com.dekosas.Steps.CategoriaCocinaStep;
import com.dekosas.Steps.PaginaPrincipalStep;
import com.dekosas.Steps.ProductoCocinaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class CartBuyStepDefinition {
    CategoriaCocinaPageObject categoriaCocinaPageObject;
    ProductoCocinaPageObject productoCocinaPageObject;
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    CategoriaCocinaStep categoriaCocinaStep;

    @Steps
    ProductoCocinaStep productoCocinaStep;

    @Given("^Que el usuario se encuentre en la subcategoria del producto$")
    public void queElUsuarioSeEncuentreEnLaSubcategoriaDelProducto() {

    }

    @When("^El usuario busque los tres productos$")
    public void elUsuarioBusqueLosTresProductos() {
        categoriaCocinaStep.clickProducto(categoriaCocinaPageObject.getProdPlacaInduccion());
        productoCocinaStep.btnAgregarAlCarrito();
        productoCocinaStep.txtBarraBusqueda("Monomando");
        productoCocinaStep.btnBuscarElemento();
        categoriaCocinaStep.clickProducto(categoriaCocinaPageObject.getProdMonomandoDorado());
        productoCocinaStep.btnAgregarAlCarrito();
        productoCocinaStep.txtBarraBusqueda("Monomando");
        productoCocinaStep.btnBuscarElemento();
        categoriaCocinaStep.clickProducto(productoCocinaPageObject.getProdMonomandoNegro());
        productoCocinaStep.btnAgregarAlCarrito();
        paginaPrincipalStep.btnIrCarroCompras();
    }

    @When("^ingrese la informacion de envio$")
    public void ingreseLaInformacionDeEnvio() {

    }

    @When("^Cancele el envio$")
    public void canceleElEnvio() {

    }

    @Then("^El usuario visualizara el carrito vacio$")
    public void elUsuarioVisualizaraElCarritoVacio() {

    }
}
