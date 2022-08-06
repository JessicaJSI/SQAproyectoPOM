package com.dekosas.StepDefinitions;

import com.dekosas.Models.DatosLogin;
import com.dekosas.Steps.PaginaPrincipalStep;
import com.dekosas.Steps.PaginaUsuarioStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.io.IOException;
import java.util.List;

public class LoginStepDefinition{

    @Steps
    PaginaPrincipalStep paginaPrincipalStep;

    @Steps
    PaginaUsuarioStep paginaUsuarioStep;


    @Given("^Que el usuario se encuentre en la pagina web y registrado previamente$")
    public void queElUsuarioSeEncuentreEnLaPaginaWebYRegistradoPreviamente() {
        paginaPrincipalStep.abrirNavegador();
    }

    @When("^Se ingrese el usuario con la clave$")
    public void seIngreseElUsuarioConLaClave() throws IOException {
        paginaPrincipalStep.clickMiCuenta();
        //Cuando se utilizan tablas
        paginaPrincipalStep.ingresarUsuario();
        paginaPrincipalStep.ingresarClave();

        paginaPrincipalStep.clickEntrar();
    }

    @Then("^El usuario visualizara la pagina de inicio$")
    public void elUsuarioVisualizaraLaPaginaDeInicio() {
        //paginaPrincipalStep.clickMiCuenta();
        paginaUsuarioStep.verificarIngreso();
    }
}
