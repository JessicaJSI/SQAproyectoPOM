package com.dekosas.Utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListaDesplegable {

    public void seleccionarTextoVisible(By elemento, String texto, WebDriver driver){
        Select seleecionar = new Select(driver.findElement(elemento));
        seleecionar.selectByVisibleText(texto);
    }

}
