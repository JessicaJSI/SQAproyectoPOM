#language:en

Feature: Seleccionar dos productos, uno desde subcategoria y otro desde la barra de busqueda

  Scenario: Buscar dos productos y agregarlos al carro de compras
    Given Que el usuario se encuentre en la pagina web
    When Se busca la categoria y subcategoria
    And se elige un producto, se aumenta en tres y se agrega al carrito
    And se elige otro producto y se agrega al carrito
    Then El usuario visualizara en el carrito los objetos seleccionados