package com.dekosas.Models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EsperaExplicita {
    public static void esperaExplicitaClick (By elemento, WebDriver driver){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public static void esperaExplicitaTexto (WebDriver driver, By elemento){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }

    public static void esperarCargaPaginas(WebDriver driver){
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    }

    public static void esperaExplicitaCondicionada (By elemento, WebDriver driver){
        WebDriverWait myWaitVar = new WebDriverWait(driver, 5);
        myWaitVar.until(ExpectedConditions.invisibilityOf(driver.findElement(elemento)));
    }
}
