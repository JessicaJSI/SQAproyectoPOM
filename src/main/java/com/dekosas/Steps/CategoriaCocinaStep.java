package com.dekosas.Steps;

import com.dekosas.Models.EsperaExplicita;
import com.dekosas.Models.Scroll;
import com.dekosas.PageObjects.CategoriaCocinaPageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class CategoriaCocinaStep {

    CategoriaCocinaPageObject categoriaCocinaPageObject = new CategoriaCocinaPageObject();

    Scroll scroll = new Scroll();

    @Step
    public void clickAccesoriosCocina(){
        categoriaCocinaPageObject.getDriver().findElement(categoriaCocinaPageObject.getAccesoriosCocina()).click();
    }

    @Step
    public void clickProducto(By elemento, Boolean hacerScroll){
        //EsperaExplicita.esperarCargaPaginas(categoriaCocinaPageObject.getDriver());
        if(hacerScroll){
            scroll.scrollElemento(categoriaCocinaPageObject.getDriver(), elemento);
        }
        categoriaCocinaPageObject.getDriver().findElement(elemento).click();
    }



}
