#language:en

Feature: Seleccionar tres productos y agregarlos al carro luego digilenciar el envio

  Background:
    Given Que el usuario se encuentre en la pagina web
    When Se busca la categoria y subcategoria

  Scenario: Buscar tres productos y digilenciar informacion de envio
    Given Que el usuario se encuentre en la subcategoria del producto
    When El usuario busque los tres productos
    And ingrese la informacion de envio
    And Cancele el envio
    Then El usuario visualizara el carrito vacio