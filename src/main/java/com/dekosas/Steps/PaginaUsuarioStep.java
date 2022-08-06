package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaUsuarioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaUsuarioStep {

    PaginaUsuarioPageObject paginaUsuarioPageObject = new PaginaUsuarioPageObject();

    @Step
    public void verificarIngreso(){
        Assert.assertThat(paginaUsuarioPageObject.getDriver().findElement(paginaUsuarioPageObject.getVerificarIngreso()).isDisplayed(), Matchers.is(true));
    }

}
