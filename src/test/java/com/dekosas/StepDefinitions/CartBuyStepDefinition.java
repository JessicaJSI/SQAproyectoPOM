package com.dekosas.StepDefinitions;

import com.dekosas.PageObjects.CategoriaCocinaPageObject;
import com.dekosas.PageObjects.ProductoCocinaPageObject;
import com.dekosas.Steps.CarritoStep;
import com.dekosas.Steps.CategoriaCocinaStep;
import com.dekosas.Steps.PaginaPrincipalStep;
import com.dekosas.Steps.ProductoCocinaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CartBuyStepDefinition {
    CategoriaCocinaPageObject categoriaCocinaPageObject;
    ProductoCocinaPageObject productoCocinaPageObject;
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    CategoriaCocinaStep categoriaCocinaStep;

    @Steps
    ProductoCocinaStep productoCocinaStep;

    @Steps
    CarritoStep carritoStep;

    @Given("^Que el usuario se encuentre en la subcategoria del producto$")
    public void queElUsuarioSeEncuentreEnLaSubcategoriaDelProducto() {

    }

    @When("^El usuario busque los tres productos$")
    public void elUsuarioBusqueLosTresProductos() {
        categoriaCocinaStep.clickProducto(categoriaCocinaPageObject.getProdPlacaInduccion(), false);
        productoCocinaStep.btnAgregarAlCarrito();
        productoCocinaStep.txtBarraBusqueda("Monomando");
        productoCocinaStep.btnBuscarElemento();
        categoriaCocinaStep.clickProducto(categoriaCocinaPageObject.getProdMonomandoDorado(), false);
        productoCocinaStep.btnAgregarAlCarrito();
        productoCocinaStep.txtBarraBusqueda("Monomando");
        productoCocinaStep.btnBuscarElemento();
        categoriaCocinaStep.clickProducto(productoCocinaPageObject.getProdMonomandoNegro(), false);
        productoCocinaStep.btnAgregarAlCarrito();
    }

    @When("^ingrese la informacion de envio$")
    public void ingreseLaInformacionDeEnvio() throws IOException {
        paginaPrincipalStep.btnIrCarroCompras();
        carritoStep.btnPasaporCaja();
        carritoStep.ingresarDireccion();
        carritoStep.seleccionarPais();
        carritoStep.seleccionarDepartamento();
        carritoStep.seleccionarCiudad();
        carritoStep.ingresarNumTelefono();
        carritoStep.seleccionarTipoID();
        carritoStep.ingresarNumID();
        carritoStep.btnSiguientePasoCompra();
    }

    @When("^Cancele el envio$")
    public void canceleElEnvio() {
        paginaPrincipalStep.btnIrPaginaPrincipal();
        paginaPrincipalStep.btnIrCarroCompras();
        carritoStep.eliminarProducto();

    }

    @Then("^El usuario visualizara el carrito vacio$")
    public void elUsuarioVisualizaraElCarritoVacio() {
        carritoStep.msjVerificacionCarroVacio();
    }
}
