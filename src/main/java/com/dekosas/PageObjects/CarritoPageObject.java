package com.dekosas.PageObjects;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Getter

public class CarritoPageObject extends PageObject {

    By msjvalidarTotalpedido = By.xpath("//*[text()='Total del pedido']");
    By btnPasarPorCaja = By.xpath("//*[text()='Pasar por caja']");
    By txtDireccion = By.xpath("//input[@name='street[0]' and @class='input-text']");
    By btnCancelarProducto = By.xpath("(//*[@class='action action-delete' and @title='Eliminar artículo'])[1]");
    By txtPais = By.xpath("//*[@name='country_id']");
    By txtDepartamento = By.xpath("//*[@name='region_id']");
    By txtCiudad = By.xpath(" //*[@name='city-select']");
    By txtNumTelefono = By.xpath(" //*[@name='telephone']");
    By txtTipoID = By.xpath(" //*[@name='bss_custom_field[tipo_identidad]']");
    By txtNumID = By.xpath(" //*[@name='bss_custom_field[cedula_o_nit]']");
    By btnSgtePasoCompra = By.xpath(" //*[@class='button action continue primary']");
    By btnEliminarProducto = By.xpath("(//*[@class='action action-delete'])[1]");
    By msjValidacionCarroVacio = By.xpath("//p[text()='No tienes ningún artículo en tu carrito de compras.']");
}
