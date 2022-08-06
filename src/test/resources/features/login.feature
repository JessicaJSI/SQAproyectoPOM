#language:en

Feature: login exitoso

  Scenario: Login de usuario exitoso
    Given Que el usuario se encuentre en la pagina web y registrado previamente
    When Se ingrese el usuario con la clave
    Then El usuario visualizara la pagina de inicio
